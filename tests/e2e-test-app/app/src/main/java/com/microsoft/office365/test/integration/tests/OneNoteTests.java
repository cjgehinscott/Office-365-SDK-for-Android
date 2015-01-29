package com.microsoft.office365.test.integration.tests;

import com.microsoft.office365.test.integration.framework.TestCase;
import com.microsoft.office365.test.integration.framework.TestGroup;
import com.microsoft.office365.test.integration.framework.TestResult;
import com.microsoft.office365.test.integration.framework.TestStatus;
import com.microsoft.services.odata.impl.DefaultDependencyResolver;
import java.util.List;

import microsoft.com.onenote.Notebook;
import microsoft.com.onenote.Page;
import microsoft.com.onenote.odata.OneNoteApiClient;

public class OneNoteTests extends TestGroup {

    public OneNoteTests() {
        super("OneNote tests");

        this.addTest(canGetNotebooks("Can get notebooks", true));
        this.addTest(canCreateNotebooks("Can create notebooks", true));

        this.addTest(canGetPageContent("Can get page content", true));

    }

    private TestCase canGetNotebooks(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    OneNoteApiClient client = getClient();
                    //Act
                    List<Notebook> notebooks = client.getnotebooks().read().get();

                    //Assert
                    if (notebooks != null && notebooks.size() > 0)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canCreateNotebooks(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    OneNoteApiClient client = getClient();

                    //Prepare
                    Notebook newNotebook = new Notebook();
                    newNotebook.setname("Test notebook");

                    //Act
                    Notebook added = client.getnotebooks().add(newNotebook).get();

                    //Assert
                    if (added != null && added.getname().equals(newNotebook.getname()))
                        result.setStatus(TestStatus.Passed);

                    //Cleanup
                    client.getnotebooks().getById(added.getid()).delete();
                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private TestCase canGetPageContent(String name, boolean enabled) {
        TestCase test = new TestCase() {

            @Override
            public TestResult executeTest() {
                try {
                    TestResult result = new TestResult();
                    result.setStatus(TestStatus.Failed);
                    result.setTestCase(this);

                    OneNoteApiClient client = getClient();

                    //Prepare
                    List<Page> pages = client.getpages().top(1).read().get();

                    //Act
                    byte[] content = client.getpages().getById(pages.get(0).getid()).getContent().get();
                    //String contentString = new String(content);
                    //Assert
                    if (content != null && content.length > 0)
                        result.setStatus(TestStatus.Passed);

                    return result;
                } catch (Exception e) {
                    return createResultFromException(e);
                }
            }
        };

        test.setName(name);
        test.setEnabled(enabled);
        return test;
    }

    private OneNoteApiClient getClient(){
        String endpoint ="https://www.onenote.com/api/beta/";
        String token = "YOUR-TOKEN";
        DefaultDependencyResolver dependencyResolver = new DefaultDependencyResolver(token);
        OneNoteApiClient client = new OneNoteApiClient(endpoint, dependencyResolver);

        return client;
    }
}

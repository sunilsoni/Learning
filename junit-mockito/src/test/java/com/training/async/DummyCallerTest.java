package com.training.async;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class DummyCallerTest {

    //region helper fields
    @Mock
    private DummyCollaborator mDummyCollaboratorMock;

    //endregion helper fields
    DummyCaller dummyCaller;

    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);
        dummyCaller = new DummyCaller(mDummyCollaboratorMock);
    }

    @After
    public void destroy(){
        dummyCaller=null;
    }

    @Test
    public void test_doSomethingAsynchronously_usingDoAnswer() {
        //arrange
        //here we stub the result
        final List<String> results = Arrays.asList("One", "Two", "Three");
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                ((DummyCallback)invocation.getArguments()[0]).onSuccess(results);
                return null;
            }
        }).when(mDummyCollaboratorMock).doSomethingAsynchronously(any(DummyCallback.class));

        //action
        dummyCaller.doSomethingAsynchronously();

        //assert
        verify(mDummyCollaboratorMock).doSomethingAsynchronously(any(DummyCallback.class));
        assertThat(dummyCaller.getResult(), is(equalTo(results)));
    }

    @Test
    public void test_doSomethingAsynchronously_usingArgumentCaptor() {

        //arrange
        ArgumentCaptor<DummyCallback> ac = ArgumentCaptor.forClass(DummyCallback.class);
        List<String> results = Arrays.asList("One", "Two", "Three");
        //action
        dummyCaller.doSomethingAsynchronously();

        //assert
        verify(mDummyCollaboratorMock).doSomethingAsynchronously(ac.capture());

        // Some assertion about the state before the callback is called
        assertThat(dummyCaller.getResult().isEmpty(), is(true));

        //trigger the reply on callbackCaptor.getValue().
        ac.getValue().onSuccess(results);

        //Some assertion about the state after the callback is called
        assertThat(dummyCaller.getResult(), is(equalTo(results)));

    }
}
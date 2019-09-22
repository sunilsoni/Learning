package com.training.async;

import java.util.ArrayList;
import java.util.List;


public class DummyCaller implements DummyCallback {

    DummyCollaborator dummyCollaborator;

    private List<String> result = new ArrayList<String>();

    public DummyCaller(DummyCollaborator dummyCollaborator) {
        this.dummyCollaborator = dummyCollaborator;
    }

    public void doSomethingAsynchronously() {
        dummyCollaborator.doSomethingAsynchronously(this);
    }

    public List<String> getResult() {
        return this.result;
    }

    @Override
    public void onSuccess(List<String> result) {
        this.result = result;
        System.out.println("On success");
    }

    @Override
    public void onFail(int code) {
        System.out.println("On Fail");
    }
}

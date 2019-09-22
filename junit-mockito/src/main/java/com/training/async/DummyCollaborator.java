package com.training.async;

import java.util.Collections;


public class DummyCollaborator {
    public static int ERROR_CODE = 1;

    public DummyCollaborator() {

    }

    public void doSomethingAsynchronously(final DummyCallback callback) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(5000);
                    callback.onSuccess(Collections.EMPTY_LIST);
                } catch (InterruptedException e) {
                    callback.onFail(ERROR_CODE);
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

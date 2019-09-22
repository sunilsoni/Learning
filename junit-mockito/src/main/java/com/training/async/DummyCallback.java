package com.training.async;

import java.util.List;


public interface DummyCallback {
    public void onSuccess(List<String> result);

    public void onFail(int code);
}

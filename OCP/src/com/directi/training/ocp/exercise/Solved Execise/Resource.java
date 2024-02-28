package com.directi.training.ocp.exercise;

public interface Resource {
    void markFree(int resourceId);
    void markBusy(int resourceId);
    int findFreeSlot();
}

package com.google.firebase.components;

import ga.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class DependencyCycleException extends DependencyException {
    private final List<b<?>> componentsInCycle;

    public DependencyCycleException(List<b<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.componentsInCycle = list;
    }

    public List<b<?>> getComponentsInCycle() {
        return this.componentsInCycle;
    }
}

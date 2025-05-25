package com.tom_roush.fontbox.afm;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class Composite {
    private String name;
    private List<CompositePart> parts = new ArrayList();

    public void addPart(CompositePart compositePart) {
        this.parts.add(compositePart);
    }

    public String getName() {
        return this.name;
    }

    public List<CompositePart> getParts() {
        return this.parts;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParts(List<CompositePart> list) {
        this.parts = list;
    }
}

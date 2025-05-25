package io.noties.markwon.core;

import jf.n;

/* loaded from: classes.dex */
public abstract class CoreProps {

    /* renamed from: a  reason: collision with root package name */
    public static final n<ListItemType> f18955a = new n<>("list-item-type");

    /* renamed from: b  reason: collision with root package name */
    public static final n<Integer> f18956b = new n<>("bullet-list-item-level");
    public static final n<Integer> c = new n<>("ordered-list-item-number");

    /* renamed from: d  reason: collision with root package name */
    public static final n<Integer> f18957d = new n<>("heading-level");

    /* renamed from: e  reason: collision with root package name */
    public static final n<String> f18958e = new n<>("link-destination");

    /* renamed from: f  reason: collision with root package name */
    public static final n<Boolean> f18959f = new n<>("paragraph-is-in-tight-list");

    /* renamed from: g  reason: collision with root package name */
    public static final n<String> f18960g = new n<>("code-block-info");

    /* loaded from: classes.dex */
    public enum ListItemType {
        BULLET,
        ORDERED
    }
}

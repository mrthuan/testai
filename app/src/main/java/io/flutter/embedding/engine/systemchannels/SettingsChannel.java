package io.flutter.embedding.engine.systemchannels;

import gf.b;
import gf.d;
import we.a;

/* loaded from: classes.dex */
public final class SettingsChannel {

    /* renamed from: a  reason: collision with root package name */
    public final b<Object> f18702a;

    /* loaded from: classes.dex */
    public enum PlatformBrightness {
        light("light"),
        dark("dark");
        
        public String name;

        PlatformBrightness(String str) {
            this.name = str;
        }
    }

    public SettingsChannel(a aVar) {
        this.f18702a = new b<>(aVar, "flutter/settings", d.f17794a, null);
    }
}

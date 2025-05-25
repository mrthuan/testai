package com.google.firebase.installations.local;

import com.google.firebase.installations.local.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import z9.e;

/* loaded from: classes2.dex */
public final class PersistedInstallation {

    /* renamed from: a  reason: collision with root package name */
    public File f13602a;

    /* renamed from: b  reason: collision with root package name */
    public final e f13603b;

    /* loaded from: classes2.dex */
    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(e eVar) {
        this.f13603b = eVar;
    }

    public final File a() {
        if (this.f13602a == null) {
            synchronized (this) {
                if (this.f13602a == null) {
                    e eVar = this.f13603b;
                    eVar.a();
                    File filesDir = eVar.f32308a.getFilesDir();
                    this.f13602a = new File(filesDir, "PersistedInstallation." + this.f13603b.d() + ".json");
                }
            }
        }
        return this.f13602a;
    }

    public final void b(a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f13605b);
            jSONObject.put("Status", aVar.c.ordinal());
            jSONObject.put("AuthToken", aVar.f13606d);
            jSONObject.put("RefreshToken", aVar.f13607e);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f13609g);
            jSONObject.put("ExpiresInSecs", aVar.f13608f);
            jSONObject.put("FisError", aVar.f13610h);
            e eVar = this.f13603b;
            eVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", eVar.f32308a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final a c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        RegistrationStatus registrationStatus = RegistrationStatus.ATTEMPT_MIGRATION;
        int optInt = jSONObject.optInt("Status", registrationStatus.ordinal());
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = b.f13617a;
        a.C0176a c0176a = new a.C0176a();
        c0176a.f13615f = 0L;
        c0176a.b(registrationStatus);
        c0176a.f13614e = 0L;
        c0176a.f13611a = optString;
        c0176a.b(RegistrationStatus.values()[optInt]);
        c0176a.c = optString2;
        c0176a.f13613d = optString3;
        c0176a.f13615f = Long.valueOf(optLong);
        c0176a.f13614e = Long.valueOf(optLong2);
        c0176a.f13616g = optString4;
        return c0176a.a();
    }
}

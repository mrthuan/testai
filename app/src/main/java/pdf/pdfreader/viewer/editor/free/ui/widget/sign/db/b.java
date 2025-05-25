package pdf.pdfreader.viewer.editor.free.ui.widget.sign.db;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;

/* compiled from: SignPathDao_Impl.java */
/* loaded from: classes3.dex */
public final class b extends w1.b<SignPathActionInfo> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f28509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, SignPathDataBase signPathDataBase) {
        super(signPathDataBase);
        this.f28509d = dVar;
    }

    @Override // w1.j
    public final String b() {
        return ea.a.p("Bk5iRStUF08IIBhFJUwpQ3AgJ04RT0VgHWQLXxlpCW48YBEoGWlTYHZgLGkZZThhQWgOLCVjCmwCcg0sCnMHeipgHWAOaVN0MmBmYB1lAWdddA4sJXMMZwNQDHQCSQBmIExYcw1gG2A1dCJlB1MccnpuC2BpYAp0BWUfUx5yOncgYB1gFnRfZShTPnIhaBplUGBCYCp0DWUfUxlyK2wCYGNgXnQRZUVCNW8mTxtlCCxVbxpoIHInbwJsOXcFYEJgIHRZZQtCWG82VCJyEGUILFVvGmggcidvAmwrbx9yDiwvb0VoHHJ-bi5PJGUVLAhvQWgLcgxuEVQabw0sCm8aaCpyeG4NVF9yP2UqLBVvHGhQciduMUYKdR9gRCA8QSJVClMRKBd1W2wzZmI_WSBYKRk_Qj9pP0k_QT9BP0Y_Qj9jPx0_VT8bP3Y_Zj9ZP0Q_GT9CPyk=", "BUGTmmjn");
    }

    @Override // w1.b
    public final void d(b2.e eVar, SignPathActionInfo signPathActionInfo) {
        SignPathActionInfo signPathActionInfo2 = signPathActionInfo;
        eVar.c(1, signPathActionInfo2.getId());
        if (signPathActionInfo2.getFilePath() == null) {
            eVar.d(2);
        } else {
            eVar.f(2, signPathActionInfo2.getFilePath());
        }
        eVar.c(3, signPathActionInfo2.getColor());
        eVar.c(4, signPathActionInfo2.getSize());
        eVar.c(5, signPathActionInfo2.getWidth());
        eVar.c(6, signPathActionInfo2.getHeight());
        e eVar2 = this.f28509d.c;
        List<SignPathActionInfo.a> signPathInfoList = signPathActionInfo2.getSignPathInfoList();
        eVar2.getClass();
        JSONArray jSONArray = new JSONArray();
        for (SignPathActionInfo.a aVar : signPathInfoList) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ea.a.p("B2MwaVduNnk4ZQ==", "HjfD8bID"), aVar.f28500a);
                jSONObject.put(ea.a.p("eA==", "AeQ0pIgB"), aVar.f28501b);
                jSONObject.put(ea.a.p("eQ==", "PqwGgRkY"), aVar.c);
                jSONObject.put(ea.a.p("CzI=", "6MsnYl9Q"), aVar.f28502d);
                jSONObject.put(ea.a.p("LDI=", "uMUqiIwb"), aVar.f28503e);
                jSONArray.put(jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2 == null) {
            eVar.d(7);
        } else {
            eVar.f(7, jSONArray2);
        }
        if (signPathActionInfo2.getOtherStrOne() == null) {
            eVar.d(8);
        } else {
            eVar.f(8, signPathActionInfo2.getOtherStrOne());
        }
        if (signPathActionInfo2.getOtherStrTwo() == null) {
            eVar.d(9);
        } else {
            eVar.f(9, signPathActionInfo2.getOtherStrTwo());
        }
        if (signPathActionInfo2.getOtherStrThree() == null) {
            eVar.d(10);
        } else {
            eVar.f(10, signPathActionInfo2.getOtherStrThree());
        }
        if (signPathActionInfo2.getOtherStrAll() == null) {
            eVar.d(11);
        } else {
            eVar.f(11, signPathActionInfo2.getOtherStrAll());
        }
        eVar.c(12, signPathActionInfo2.isOtherBoolOne() ? 1L : 0L);
        eVar.c(13, signPathActionInfo2.isOtherBoolTwo() ? 1L : 0L);
        eVar.c(14, signPathActionInfo2.isOtherBoolThree() ? 1L : 0L);
        eVar.c(15, signPathActionInfo2.isOtherBoolFour() ? 1L : 0L);
        eVar.c(16, signPathActionInfo2.getOtherIntOne());
        eVar.c(17, signPathActionInfo2.getOtherIntTwo());
        eVar.c(18, signPathActionInfo2.getOtherIntThree());
        eVar.c(19, signPathActionInfo2.getOtherIntFour());
    }
}

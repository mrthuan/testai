package com.bytedance.sdk.component.fl.CJ;

import com.bytedance.sdk.component.fl.ac.ac;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: DuplicateRequestCheckVisitor.java */
/* loaded from: classes.dex */
public class ABk extends ROR {
    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public String Qhi() {
        return "check_duplicate";
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public void Qhi(ac acVar) {
        List<ac> list;
        String bxS = acVar.bxS();
        Map<String, List<ac>> ROR = acVar.tP().ROR();
        synchronized (ROR) {
            list = ROR.get(bxS);
            if (list == null) {
                list = new LinkedList<>();
            }
        }
        synchronized (list) {
            list.add(acVar);
            ROR.put(bxS, list);
            if (list.size() <= 1) {
                acVar.Qhi(new WAv());
            }
        }
    }
}

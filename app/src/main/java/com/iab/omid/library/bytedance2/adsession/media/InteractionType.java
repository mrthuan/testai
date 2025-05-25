// Auto-fixed: added missing class declaration
public class InteractionType {
package com.iab.omid.library.bytedance2.adsession.media;

import com.inmobi.media.C1646h;

/* loaded from: classes2.dex */
public enum InteractionType {
    CLICK(C1646h.CLICK_BEACON),
    INVITATION_ACCEPTED("invitationAccept");
    
    String interactionType;

    InteractionType(String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.interactionType;
    }
}

}

package km;

import androidx.room.RoomDatabase;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIAnswerContent;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIFileEntity;
import w1.j;

/* compiled from: AIDao_Impl.java */
/* loaded from: classes3.dex */
public final class c implements km.b {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f19897a;

    /* renamed from: b  reason: collision with root package name */
    public final a f19898b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final C0266c f19899d;

    /* renamed from: e  reason: collision with root package name */
    public final d f19900e;

    /* renamed from: f  reason: collision with root package name */
    public final e f19901f;

    /* renamed from: g  reason: collision with root package name */
    public final f f19902g;

    /* renamed from: h  reason: collision with root package name */
    public final g f19903h;

    /* renamed from: i  reason: collision with root package name */
    public final h f19904i;

    /* compiled from: AIDao_Impl.java */
    /* loaded from: classes3.dex */
    public class a extends w1.b<AIFileEntity> {
        @Override // w1.j
        public final String b() {
            return ea.a.p("ek4YRSFUQk8gIGZFOUwXQwEge04ST2NgLmksZj9sK3NTIGNgGmQCLBJyUW0GdDNGLWxXUCd0K2BjYBVpOmUeYUdoKywTZgtsF05VbQxgemAiaV5lEnkzZS8sE2M3bh1oXHcDaQB0DXILYBhgD2k6ZRdpSGUmLCN1P2wcYTJUJ21WYGdgFngWZRxkUWQvaTNsIHN9biNgb2AqeAdlOGQrZHVpLmwXczZ3HWAYYAx4ImUqZFdkAGkmbCtzJ2gkZStgH2AueAdlDGQXZH1uHUY_ZShkQU8oZSMsL2ULdDNuKmVXSSV0NWkHbBZzYHcGYHpgIXhGZShkJmQGbgdGP2UiZEBUI3IWZQIsEmVMdAxuMmUgQl1vKmUibglpFmwycwFuVmBnYBZ4FmUcZFFkK285bCFhXEYvZS9kPFQEbzYsLmVLdC5uF2UGQh1vWGUIbhBpIWxWcxJoMWUqYFogAEECVXZTaygddQ5sG2YcP0UgZiloPx4_aj9vP2M_Xz96P2I_Hz9nP18_Tj9ePxg_RT96Pyk=", "OsVNXDUa");
        }

        @Override // w1.b
        public final void d(b2.e eVar, AIFileEntity aIFileEntity) {
            AIFileEntity aIFileEntity2 = aIFileEntity;
            eVar.c(1, aIFileEntity2.getId());
            if (aIFileEntity2.getRemoteFilePath() == null) {
                eVar.d(2);
            } else {
                eVar.f(2, aIFileEntity2.getRemoteFilePath());
            }
            if (aIFileEntity2.getFilePath() == null) {
                eVar.d(3);
            } else {
                eVar.f(3, aIFileEntity2.getFilePath());
            }
            if (aIFileEntity2.getFileName() == null) {
                eVar.d(4);
            } else {
                eVar.f(4, aIFileEntity2.getFileName());
            }
            eVar.c(5, aIFileEntity2.getFileType());
            eVar.c(6, aIFileEntity2.getCanShowHistory());
            eVar.c(7, aIFileEntity2.getFileSize());
            eVar.c(8, aIFileEntity2.getUploadTime());
            if (aIFileEntity2.getExtendedFieldsOne() == null) {
                eVar.d(9);
            } else {
                eVar.f(9, aIFileEntity2.getExtendedFieldsOne());
            }
            if (aIFileEntity2.getExtendedFieldsTwo() == null) {
                eVar.d(10);
            } else {
                eVar.f(10, aIFileEntity2.getExtendedFieldsTwo());
            }
            if (aIFileEntity2.getExtendedFieldsThree() == null) {
                eVar.d(11);
            } else {
                eVar.f(11, aIFileEntity2.getExtendedFieldsThree());
            }
            eVar.c(12, aIFileEntity2.getExtendedIntFieldsOne());
            eVar.c(13, aIFileEntity2.getExtendedIntFieldsTwo());
            eVar.c(14, aIFileEntity2.getExtendedIntFieldsThree());
            eVar.c(15, aIFileEntity2.isExtendedBooleanFieldsOne() ? 1L : 0L);
            eVar.c(16, aIFileEntity2.isExtendedBooleanFieldsTwo() ? 1L : 0L);
            eVar.c(17, aIFileEntity2.isExtendedBooleanFieldsThree() ? 1L : 0L);
        }
    }

    /* compiled from: AIDao_Impl.java */
    /* loaded from: classes3.dex */
    public class b extends w1.b<km.a> {
        @Override // w1.j
        public final String b() {
            return ea.a.p("ek4YRSFUQk8gIGZFOUwXQwEge04ST2NgMmkvYwRhGF9abi1vEyBKYBFoVXQgZDYsJHJXbSl0JkM7YQRJCGBAYFpkKywTZgtsF0lQYEVgNWgldGZ5NmUjLDNyFW0DdAlGWmwuUBJ0CmBeYFJpBWUGYTBoUiwmZipsNk4RbQlgQGBVaSdlJ3kSZRIsVGYAbDNTLXpXYGpgIGgydD1lH3MNZ1ZUIm0WYE5gAW9GdD1hMWBoYEN1I3M3aTxuJHkcZQwsU3E-ZQB0C28cQ1tuHWU4dCQsUnEzZTB0Om8eUxhhGGVTLCthHXMVZQBUTXAMYHpgLXN-byVrIywzZQh0CW4IZVdGImUfZBFPHGVULAllLnQhblZlIkYqZT9kA1QbbwwsU2UzdBZuBmUWRl1lBWQlVCxyV2UmLCNlK3QVbghlCElddA1pFmwGcz1uUWBFYDN4MGVcZCNkCm4nRhllAGQfVERvKywTZRp0F25QZQ1JOHQCaVdsInMXaCFlFWBAYAl4R2UlZBZkIG8dbFFhB0Y_ZShkQU8oZSMsM2UIdAluCGVXQiRvH2UDbjRpUWwNcwJ3K2AeYCN4N2U9ZBVkLm8DbFZhJUYaZQ5kAVRccgxlNilkVnNME0UQIHtuBWwAaQooDCxrMFosXSxNLAssVixpLHssDSx5LHwsbCxPLFMsUywMLHQsTCxdLE0sCyxWLGkseywNLHksfCk=", "Spll0mHn");
        }

        @Override // w1.b
        public final void d(b2.e eVar, km.a aVar) {
            km.a aVar2 = aVar;
            eVar.c(1, aVar2.f19872a);
            String str = aVar2.f19873b;
            if (str == null) {
                eVar.d(2);
            } else {
                eVar.f(2, str);
            }
            String str2 = aVar2.c;
            if (str2 == null) {
                eVar.d(3);
            } else {
                eVar.f(3, str2);
            }
            eVar.c(4, aVar2.f19874d);
            eVar.c(5, aVar2.f19875e);
            String str3 = aVar2.f19876f;
            if (str3 == null) {
                eVar.d(6);
            } else {
                eVar.f(6, str3);
            }
            String str4 = aVar2.f19877g;
            if (str4 == null) {
                eVar.d(7);
            } else {
                eVar.f(7, str4);
            }
            String str5 = aVar2.f19878h;
            if (str5 == null) {
                eVar.d(8);
            } else {
                eVar.f(8, str5);
            }
            eVar.c(9, aVar2.f19879i);
            eVar.c(10, aVar2.f19880j);
            eVar.c(11, aVar2.f19884n);
            eVar.c(12, aVar2.f19885o);
            eVar.c(13, aVar2.f19887q);
            String str6 = aVar2.f19888r;
            if (str6 == null) {
                eVar.d(14);
            } else {
                eVar.f(14, str6);
            }
            eVar.c(15, aVar2.f19889s);
            eVar.c(16, aVar2.f19891u);
            eVar.c(17, aVar2.B ? 1L : 0L);
            String str7 = aVar2.C;
            if (str7 == null) {
                eVar.d(18);
            } else {
                eVar.f(18, str7);
            }
            String str8 = aVar2.D;
            if (str8 == null) {
                eVar.d(19);
            } else {
                eVar.f(19, str8);
            }
            String str9 = aVar2.E;
            if (str9 == null) {
                eVar.d(20);
            } else {
                eVar.f(20, str9);
            }
            eVar.c(21, aVar2.F);
            eVar.c(22, aVar2.G);
            eVar.c(23, aVar2.H);
            eVar.c(24, aVar2.I ? 1L : 0L);
            eVar.c(25, aVar2.J ? 1L : 0L);
            eVar.c(26, aVar2.K ? 1L : 0L);
        }
    }

    /* compiled from: AIDao_Impl.java */
    /* renamed from: km.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0266c extends w1.b<AIAnswerContent> {
        @Override // w1.j
        public final String b() {
            return ea.a.p("ek4YRSFUQk8gIGZFOUwXQwEge04ST2NgU2kKYRxzD2VBXyhvHXQHbgZgFCgJaTJgaGBGeTZlIyxSZTtkO24cZUtgZ2AQaAN0O2RULAlmP2whSVZgamAgb1x0MG4GYFRgWnMHbxBrAiwSaVlnPmkydCxgHmAvbSRIV2kyaAZgVGBWeD9lHWQHZDRpUWwNcxluIWAeYCN4N2VcZDBkNGkdbFdzH3ccYE5gF3hAZQdkM2QCaVdsInMXaEBlMGBeYB14R2UlZBZkK24GRl1lBWQlTyplUiwmZTt0V24xZRZJFnR1aS5sF3M2dx1gGGAMeCJlKmRXZA9uN0ZbZTlkAVQQclZlKywTZRp0F25QZQ1COW8oZVNuAGkmbFZzGm4XYFRgVng_ZR1kB2Qwb1tsDGE4Ri1lXmQ1VDRvUiw1ZQp0HW5XZS9CHG8OZRNucmkMbDJzEGhAZSNgaiBkQRlVN1NYKF11J2waZko_XiAEKUU_ej9oPx4_aj9vPx4_eT9eP1Q_Hz9nP18_Tj9ePxg_RT8p", "2UrxuawQ");
        }

        @Override // w1.b
        public final void d(b2.e eVar, AIAnswerContent aIAnswerContent) {
            AIAnswerContent aIAnswerContent2 = aIAnswerContent;
            eVar.c(1, aIAnswerContent2.getId());
            eVar.c(2, aIAnswerContent2.getType());
            eVar.c(3, aIAnswerContent2.getEndIndex());
            eVar.c(4, aIAnswerContent2.getChatId());
            eVar.c(5, aIAnswerContent2.getFileId());
            if (aIAnswerContent2.getContent() == null) {
                eVar.d(6);
            } else {
                eVar.f(6, aIAnswerContent2.getContent());
            }
            eVar.c(7, aIAnswerContent2.isLock() ? 1L : 0L);
            eVar.c(8, aIAnswerContent2.getImgWidth());
            eVar.c(9, aIAnswerContent2.getImgHeight());
            if (aIAnswerContent2.getExtendedFieldsOne() == null) {
                eVar.d(10);
            } else {
                eVar.f(10, aIAnswerContent2.getExtendedFieldsOne());
            }
            if (aIAnswerContent2.getExtendedFieldsTwo() == null) {
                eVar.d(11);
            } else {
                eVar.f(11, aIAnswerContent2.getExtendedFieldsTwo());
            }
            if (aIAnswerContent2.getExtendedFieldsThree() == null) {
                eVar.d(12);
            } else {
                eVar.f(12, aIAnswerContent2.getExtendedFieldsThree());
            }
            eVar.c(13, aIAnswerContent2.getExtendedIntFieldsOne());
            eVar.c(14, aIAnswerContent2.getExtendedIntFieldsTwo());
            eVar.c(15, aIAnswerContent2.getExtendedIntFieldsThree());
            eVar.c(16, aIAnswerContent2.isExtendedBooleanFieldsOne() ? 1L : 0L);
            eVar.c(17, aIAnswerContent2.isExtendedBooleanFieldsTwo() ? 1L : 0L);
            eVar.c(18, aIAnswerContent2.isExtendedBooleanFieldsThree() ? 1L : 0L);
        }
    }

    /* compiled from: AIDao_Impl.java */
    /* loaded from: classes3.dex */
    public class d extends j {
        @Override // w1.j
        public final String b() {
            ea.a.p("PlA9QTZFF2EhXwVoVXQIaVZmPSAaRWIgBXUUcyVpLW44dBh0ByAKIHcgMUhxUhIgUWRyPWk_", "E9kyb7GX");
            return ea.a.p("GlB1QS1FF2EzXyloFHQ3aVtmASAWRTEgOnUTcwdpKW4cdFB0HCAKIGUgHUgwUi0gXGROPWU_", "OdPtKvsF");
        }
    }

    /* compiled from: AIDao_Impl.java */
    /* loaded from: classes3.dex */
    public class e extends j {
        @Override // w1.j
        public final String b() {
            ea.a.p("GlB1QS1FF2EzXyloFHQ3aVtmASAWRTEgK3MYbxdrcj1vMBFXMUVlRXppOUwaYwMgCCAx", "1gMhBTtR");
            return ea.a.p("ZlAPQSdFQmEbX1doCHQJaSpmXSAVRRcgOHN7b1BrED0TMGtXO0UwRVJpR0wGYz0geSAx", "Q730krN1");
        }
    }

    /* compiled from: AIDao_Impl.java */
    /* loaded from: classes3.dex */
    public class f extends j {
        @Override // w1.j
        public final String b() {
            ea.a.p("GlB1QS1FF2EzXytuBncNcmpjAW4xZQt0bVMLVERpJUwgY1ogRCAHIA1ID1IwIAFzeW8Na2U9RTE=", "gl8JMNdV");
            return ea.a.p("ZlAPQSdFQmEbX1VuGnczchtjXW4yZS10cFMNVHNpEUxcYyAgTiBSICVIcVIsID9zCG9Ra2Y9YzE=", "PHSbV3Bf");
        }
    }

    /* compiled from: AIDao_Impl.java */
    /* loaded from: classes3.dex */
    public class g extends j {
        @Override // w1.j
        public final String b() {
            ea.a.p("ZlAPQSdFQmEbX1VuGnczchtjXW4yZS10SFMgVFFlWWR6bi9lCyBfIE0gY0gsUhMgLWQSPWY_", "heq7V0Rb");
            return ea.a.p("ZlAPQSdFQmEbX1VuGnczchtjXW4yZS10ZFNwVGNlXWR6bi9lCyBfIE0gY0gsUhMgLWQSPWY_", "D5C3cxeJ");
        }
    }

    /* compiled from: AIDao_Impl.java */
    /* loaded from: classes3.dex */
    public class h extends j {
        @Override // w1.j
        public final String b() {
            ea.a.p("GlAnQWNFTWEhXwBpWGUkIGtFBiAqYVhTHG8GSDhzNm89eUM9FzFNdyBlFGUUaTMgBSA_", "TZOc7m3W");
            return ea.a.p("GlB1QS1FF2EzXyxpGWUbIGZFOiAmYQtTBW8eSB5zPm89eRE9WTEXdzJlOGVVaQwgCCA_", "jGCZmiwJ");
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.f19897a = roomDatabase;
        this.f19898b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.f19899d = new C0266c(roomDatabase);
        this.f19900e = new d(roomDatabase);
        this.f19901f = new e(roomDatabase);
        this.f19902g = new f(roomDatabase);
        this.f19903h = new g(roomDatabase);
        this.f19904i = new h(roomDatabase);
    }
}

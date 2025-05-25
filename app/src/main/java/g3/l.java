package g3;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* loaded from: classes.dex */
public final class l implements m, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f17569a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f17570b = new Path();
    public final Path c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f17571d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final MergePaths f17572e;

    /* compiled from: MergePathsContent.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17573a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f17573a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17573a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17573a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17573a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17573a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(MergePaths mergePaths) {
        mergePaths.getClass();
        this.f17572e = mergePaths;
    }

    @TargetApi(19)
    public final void a(Path.Op op2) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f17570b;
        path.reset();
        Path path2 = this.f17569a;
        path2.reset();
        ArrayList arrayList = this.f17571d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            m mVar = (m) arrayList.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                ArrayList arrayList2 = (ArrayList) dVar.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((m) arrayList2.get(size2)).getPath();
                    h3.o oVar = dVar.f17524k;
                    if (oVar != null) {
                        matrix2 = oVar.d();
                    } else {
                        matrix2 = dVar.c;
                        matrix2.reset();
                    }
                    path3.transform(matrix2);
                    path.addPath(path3);
                }
            } else {
                path.addPath(mVar.getPath());
            }
        }
        int i10 = 0;
        m mVar2 = (m) arrayList.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> e10 = dVar2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) e10;
                if (i10 >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((m) arrayList3.get(i10)).getPath();
                h3.o oVar2 = dVar2.f17524k;
                if (oVar2 != null) {
                    matrix = oVar2.d();
                } else {
                    matrix = dVar2.c;
                    matrix.reset();
                }
                path4.transform(matrix);
                path2.addPath(path4);
                i10++;
            }
        } else {
            path2.set(mVar2.getPath());
        }
        this.c.op(path2, path, op2);
    }

    @Override // g3.c
    public final void b(List<c> list, List<c> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17571d;
            if (i10 < arrayList.size()) {
                ((m) arrayList.get(i10)).b(list, list2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // g3.j
    public final void e(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof m) {
                this.f17571d.add((m) previous);
                listIterator.remove();
            }
        }
    }

    @Override // g3.m
    public final Path getPath() {
        Path path = this.c;
        path.reset();
        MergePaths mergePaths = this.f17572e;
        if (mergePaths.f6059b) {
            return path;
        }
        int i10 = a.f17573a[mergePaths.f6058a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            a(Path.Op.XOR);
                        }
                    } else {
                        a(Path.Op.INTERSECT);
                    }
                } else {
                    a(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                a(Path.Op.UNION);
            }
        } else {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f17571d;
                if (i11 >= arrayList.size()) {
                    break;
                }
                path.addPath(((m) arrayList.get(i11)).getPath());
                i11++;
            }
        }
        return path;
    }
}

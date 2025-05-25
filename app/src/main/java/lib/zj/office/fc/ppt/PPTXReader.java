package lib.zj.office.fc.ppt;

import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lh.g;
import lh.k;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.dom4j.ElementPath;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.PackageRelationship;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipCollection;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipTypes;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import lib.zj.office.fc.ppt.attribute.RunAttr;
import lib.zj.office.fc.ppt.bulletnumber.BulletNumberManage;
import lib.zj.office.fc.ppt.reader.BackgroundReader;
import lib.zj.office.fc.ppt.reader.HyperlinkReader;
import lib.zj.office.fc.ppt.reader.LayoutReader;
import lib.zj.office.fc.ppt.reader.MasterReader;
import lib.zj.office.fc.ppt.reader.PictureReader;
import lib.zj.office.fc.ppt.reader.ReaderKit;
import lib.zj.office.fc.ppt.reader.SmartArtReader;
import lib.zj.office.fc.ppt.reader.StyleReader;
import lib.zj.office.fc.ppt.reader.TableStyleReader;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.system.AbortReaderError;
import lib.zj.office.system.StopReaderError;
import lib.zj.office.system.b;
import lib.zj.office.system.f;
import th.a;
import th.c;
import th.d;
import th.e;
import zh.m;
import zh.n;

/* loaded from: classes3.dex */
public class PPTXReader extends b {
    public static final int FIRST_READ_SLIDE_NUM = 2;
    private int currentReaderIndex;
    private e defaultStyle;
    private String filePath;
    private String key;
    private boolean note;
    private PackagePart packagePart;
    private a pgLayout;
    private th.b pgMaster;
    private c pgModel;
    private d pgSlide;
    private boolean searched;
    private boolean showMasterSp;
    private List<String> sldIds;
    private PackagePart slidePart;
    private ZipPackage zipPackage;
    private boolean isReaderFinish = false;
    private int slideNum = 1;
    private Map<String, a> nameLayout = new Hashtable();
    private Map<String, th.b> nameMaster = new Hashtable();

    public PPTXReader(f fVar, String str) {
        this.control = fVar;
        this.filePath = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSlideID(Element element) {
        if (this.sldIds == null) {
            this.sldIds = new ArrayList();
        }
        this.sldIds.add(getUsefulAttributeValue(element));
    }

    private int getGroupShapeID(int i10, Map<Integer, List<Integer>> map) {
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            List<Integer> list = map.get(Integer.valueOf(intValue));
            if (list != null && list.contains(Integer.valueOf(i10))) {
                return intValue;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getUsefulAttributeValue(Element element) {
        for (int i10 = 0; i10 < element.attributeCount(); i10++) {
            if (!TextUtils.isEmpty(element.attribute(i10).getQName().getNamespace().getURI())) {
                return element.attribute(i10).getValue();
            }
        }
        return "";
    }

    private void processAnimation(d dVar, Element element) {
        Element element2;
        String attributeValue = element.attributeValue("presetClass");
        Element element3 = element.element("childTnLst");
        byte b10 = 0;
        if (element3.element("set") != null) {
            element2 = element3.element("set").element("cBhvr").element("tgtEl").element("spTgt");
        } else {
            element2 = ((Element) element3.elements().get(0)).element("cBhvr").element("tgtEl").element("spTgt");
        }
        String attributeValue2 = element2.attributeValue("spid");
        if (!attributeValue.equals("entr")) {
            if (attributeValue.equals("emph")) {
                b10 = 1;
            } else if (attributeValue.equals("exit")) {
                b10 = 2;
            } else {
                return;
            }
        }
        if (element2.element("txEl") != null && element2.element("txEl").element("pRg") != null) {
            Element element4 = element2.element("txEl").element("pRg");
            dVar.b(new qh.e(Integer.parseInt(attributeValue2), b10, Integer.parseInt(element4.attributeValue("st")), Integer.parseInt(element4.attributeValue("end"))));
        } else if (element2.element("bg") != null) {
            dVar.b(new qh.e(Integer.parseInt(attributeValue2), b10, -1, -1));
        } else {
            dVar.b(new qh.e(Integer.parseInt(attributeValue2), b10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processBackground(PackagePart packagePart, th.b bVar, a aVar, d dVar, Element element) {
        if (element == null && dVar.f30041h == null) {
            eh.b bVar2 = aVar.f30014a;
            if (bVar2 == null) {
                bVar2 = bVar.f30020a;
            }
            dVar.f30041h = bVar2;
        } else if (element != null) {
            dVar.f30041h = BackgroundReader.instance().getBackground(this.control, this.zipPackage, packagePart, bVar, element);
        }
    }

    private void processDefaultFontColor(Element element, int i10) {
        Element element2;
        Element element3;
        Element element4;
        String attributeValue;
        if (element != null && (element2 = element.element("defRPr")) != null && (element3 = element2.element("solidFill")) != null && (element4 = element3.element("schemeClr")) != null && element4.attribute("val") != null && (attributeValue = element4.attributeValue("val")) != null && attributeValue.length() > 0) {
            e eVar = this.defaultStyle;
            eVar.getClass();
            if (i10 > 0) {
                if (eVar.f30049d == null) {
                    eVar.f30049d = new Hashtable();
                }
                eVar.f30049d.put(Integer.valueOf(i10), attributeValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processDefaultTextStyle(Element element) {
        Map<String, th.b> map = this.nameMaster;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            if (it.hasNext()) {
                StyleReader.instance().setStyleIndex(1);
                this.defaultStyle = StyleReader.instance().getStyles(this.control, this.nameMaster.get(it.next()), null, element);
            }
        }
        if (element != null && this.defaultStyle != null) {
            Element element2 = element.element("lvl1pPr");
            if (element2 != null) {
                processDefaultFontColor(element2, 1);
            }
            Element element3 = element.element("lvl2pPr");
            if (element3 != null) {
                processDefaultFontColor(element3, 2);
            }
            Element element4 = element.element("lvl3pPr");
            if (element4 != null) {
                processDefaultFontColor(element4, 3);
            }
            Element element5 = element.element("lvl4pPr");
            if (element5 != null) {
                processDefaultFontColor(element5, 4);
            }
            Element element6 = element.element("lvl5pPr");
            if (element6 != null) {
                processDefaultFontColor(element6, 5);
            }
            Element element7 = element.element("lvl6pPr");
            if (element7 != null) {
                processDefaultFontColor(element7, 6);
            }
            Element element8 = element.element("lvl7pPr");
            if (element8 != null) {
                processDefaultFontColor(element8, 7);
            }
            Element element9 = element.element("lvl8pPr");
            if (element9 != null) {
                processDefaultFontColor(element9, 8);
            }
            Element element10 = element.element("lvl9pPr");
            if (element10 != null) {
                processDefaultFontColor(element10, 9);
            }
        }
    }

    private void processGroupShape(d dVar) {
        HashMap hashMap = dVar.f30044k;
        if (hashMap == null) {
            return;
        }
        int f10 = dVar.f();
        for (int i10 = 0; i10 < f10; i10++) {
            g e10 = dVar.e(i10);
            e10.i(getGroupShapeID(e10.e(), hashMap));
        }
    }

    private void processGroupShapeID(Map<Integer, List<Integer>> map) {
        boolean z10 = false;
        ArrayList arrayList = null;
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            List<Integer> list = map.get(Integer.valueOf(intValue));
            int size = list.size();
            ArrayList arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                List<Integer> list2 = map.get(list.get(i10));
                if (list2 != null && list2.size() > 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.addAll(list2);
                }
            }
            if (arrayList2 != null && arrayList2.size() > 0) {
                list.addAll(arrayList2);
                z10 = true;
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(Integer.valueOf(intValue));
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                map.remove(arrayList.get(i11));
            }
            processGroupShapeID(map);
        }
    }

    private void processNotes(PackagePart packagePart, d dVar) {
        String notes;
        PackageRelationship relationship = packagePart.getRelationshipsByType(PackageRelationshipTypes.NOTES_SLIDE).getRelationship(0);
        if (relationship != null) {
            PackagePart part = this.zipPackage.getPart(relationship.getTargetURI());
            SAXReader sAXReader = new SAXReader();
            InputStream inputStream = part.getInputStream();
            Element rootElement = sAXReader.read(inputStream).getRootElement();
            if (rootElement != null && (notes = ReaderKit.instance().getNotes(rootElement)) != null) {
                dVar.f30040g = new s5.a(notes);
            }
            inputStream.close();
        }
    }

    private void processPresentation() {
        PackagePart packagePart;
        e eVar;
        zh.c cVar;
        String attributeValue;
        SAXReader sAXReader = new SAXReader();
        try {
            try {
                InputStream inputStream = this.packagePart.getInputStream();
                PresentationSaxHandler presentationSaxHandler = new PresentationSaxHandler();
                sAXReader.addHandler("/presentation/sldMasterIdLst", presentationSaxHandler);
                sAXReader.addHandler("/presentation/defaultTextStyle", presentationSaxHandler);
                sAXReader.addHandler("/presentation/sldSz", presentationSaxHandler);
                sAXReader.addHandler("/presentation/sldIdLst/sldId", presentationSaxHandler);
                Element rootElement = sAXReader.read(inputStream).getRootElement();
                if (rootElement != null && rootElement.attribute("firstSlideNum") != null && (attributeValue = rootElement.attributeValue("firstSlideNum")) != null && attributeValue.length() > 0) {
                    this.pgModel.f30033g = Integer.valueOf(attributeValue).intValue() - 1;
                }
                inputStream.close();
                List<String> list = this.sldIds;
                if (list != null) {
                    this.pgModel.f30031e = list.size();
                    ArrayList<PackagePart> partsByContentType = this.zipPackage.getPartsByContentType(ContentTypes.TABLE_STYLE_PART);
                    if (partsByContentType.size() > 0 && (packagePart = partsByContentType.get(0)) != null && (eVar = this.defaultStyle) != null) {
                        m a10 = n.f32394b.a(eVar.b(1));
                        new TableStyleReader().read(this.pgModel, packagePart, (a10 == null || (cVar = a10.c) == null || (r2 = cVar.b((short) 1, true)) < 0) ? 12 : 12);
                    }
                    processSlidePart();
                    return;
                }
                throw new Exception("Format error");
            } catch (Exception e10) {
                throw e10;
            }
        } finally {
            sAXReader.resetHandlers();
        }
    }

    private void processSlide(String str) {
        this.showMasterSp = true;
        PackagePart part = this.zipPackage.getPart(this.packagePart.getRelationship(str).getTargetURI());
        this.slidePart = part;
        PackagePart part2 = this.zipPackage.getPart(part.getRelationshipsByType(PackageRelationshipTypes.LAYOUT_PART).getRelationship(0).getTargetURI());
        PackageRelationship relationship = part2.getRelationshipsByType(PackageRelationshipTypes.SLIDE_MASTER).getRelationship(0);
        th.b bVar = this.nameMaster.get(relationship.getTargetURI().toString());
        this.pgMaster = bVar;
        if (bVar == null) {
            PackagePart part3 = this.zipPackage.getPart(relationship.getTargetURI());
            this.pgMaster = MasterReader.instance().getMasterData(this.control, this.zipPackage, part3, this.pgModel);
            this.nameMaster.put(part3.getPartName().getName(), this.pgMaster);
        }
        a aVar = this.nameLayout.get(part2.getPartName().getName());
        this.pgLayout = aVar;
        if (aVar == null) {
            this.pgLayout = LayoutReader.instance().getLayouts(this.control, this.zipPackage, part2, this.pgModel, this.pgMaster, null);
            if (!this.isDisposed.get()) {
                this.nameLayout.put(part2.getPartName().getName(), this.pgLayout);
            }
        }
        d dVar = new d();
        this.pgSlide = dVar;
        dVar.c = 2;
        PackageRelationshipCollection relationshipsByType = this.slidePart.getRelationshipsByType(PackageRelationshipTypes.DIAGRAM_DATA);
        if (relationshipsByType != null && relationshipsByType.size() > 0) {
            int size = relationshipsByType.size();
            for (int i10 = 0; i10 < size; i10++) {
                PackageRelationship relationship2 = relationshipsByType.getRelationship(i10);
                d dVar2 = this.pgSlide;
                String id2 = relationship2.getId();
                SmartArtReader instance = SmartArtReader.instance();
                f fVar = this.control;
                ZipPackage zipPackage = this.zipPackage;
                k read = instance.read(fVar, zipPackage, this.pgModel, this.pgMaster, this.pgLayout, this.pgSlide, this.slidePart, zipPackage.getPart(relationship2.getTargetURI()));
                if (dVar2.f30046m == null) {
                    dVar2.f30046m = new HashMap();
                }
                dVar2.f30046m.put(id2, read);
            }
        }
        HyperlinkReader.instance().getHyperlinkList(this.control, this.slidePart);
        SAXReader sAXReader = new SAXReader();
        try {
            InputStream inputStream = this.slidePart.getInputStream();
            SlideSaxHandler slideSaxHandler = new SlideSaxHandler();
            sAXReader.addHandler("/sld/cSld/bg", slideSaxHandler);
            sAXReader.addHandler("/sld/cSld/spTree/sp", slideSaxHandler);
            sAXReader.addHandler("/sld/cSld/spTree/cxnSp", slideSaxHandler);
            sAXReader.addHandler("/sld/cSld/spTree/pic", slideSaxHandler);
            sAXReader.addHandler("/sld/cSld/spTree/graphicFrame", slideSaxHandler);
            sAXReader.addHandler("/sld/cSld/spTree/grpSp", slideSaxHandler);
            sAXReader.addHandler("/sld/cSld/spTree/AlternateContent", slideSaxHandler);
            sAXReader.addHandler("/sld/timing/tnLst/par/cTn/childTnLst/seq/cTn/childTnLst/par", slideSaxHandler);
            sAXReader.addHandler("/sld/timing/bldLst/bldP", slideSaxHandler);
            sAXReader.addHandler("/sld/transition", slideSaxHandler);
            sAXReader.addHandler("/sld/AlternateContent/Choice/transition", slideSaxHandler);
            sAXReader.addHandler("/sld", slideSaxHandler);
            sAXReader.read(inputStream);
            inputStream.close();
            processBackground(this.slidePart, this.pgMaster, this.pgLayout, this.pgSlide, null);
            processGroupShape(this.pgSlide);
            d dVar3 = this.pgSlide;
            int i11 = this.slideNum;
            this.slideNum = i11 + 1;
            dVar3.f30036b = i11;
            processNotes(this.slidePart, dVar3);
            if (this.showMasterSp && this.pgLayout.f30019g) {
                this.pgSlide.f30042i[0] = this.pgMaster.f30027i;
            }
            d dVar4 = this.pgSlide;
            dVar4.f30042i[1] = this.pgLayout.f30018f;
            c cVar = this.pgModel;
            synchronized (cVar) {
                ArrayList arrayList = cVar.f30029b;
                if (arrayList != null) {
                    arrayList.add(dVar4);
                }
            }
            this.pgSlide = null;
            this.pgLayout = null;
            this.pgMaster = null;
            this.slidePart = null;
            PictureReader.instance().dispose();
            HyperlinkReader.instance().disposs();
        } finally {
            sAXReader.resetHandlers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processSlideShow(d dVar, Element element) {
        try {
            List<Element> elements = element.element("cTn").element("childTnLst").elements("par");
            if (elements.size() >= 1) {
                for (Element element2 : elements) {
                    for (Element element3 : element2.element("cTn").element("childTnLst").elements("par")) {
                        processAnimation(dVar, element3.element("cTn"));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public void backReader() {
        try {
            List<String> list = this.sldIds;
            int i10 = this.currentReaderIndex;
            this.currentReaderIndex = i10 + 1;
            processSlide(list.get(i10));
            this.control.r(536870927, null);
        } catch (Error e10) {
            this.control.o().c().a(true, e10);
        }
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public void dispose() {
        eh.a aVar;
        c cVar;
        List<String> list;
        if (isReaderFinish()) {
            super.dispose();
            if (this.abortReader && (cVar = this.pgModel) != null && cVar.f30031e < 2 && (list = this.sldIds) != null && list.size() > 0) {
                this.pgModel.b();
            }
            Map<String, a> map = this.nameLayout;
            if (map != null) {
                for (String str : map.keySet()) {
                    a aVar2 = this.nameLayout.get(str);
                    eh.b bVar = aVar2.f30014a;
                    if (bVar != null && (aVar = bVar.f16573f) != null) {
                        aVar.b();
                    }
                    HashMap hashMap = aVar2.f30015b;
                    if (hashMap != null) {
                        for (Object obj : hashMap.keySet()) {
                            ((e) hashMap.get(obj)).a();
                        }
                        hashMap.clear();
                    }
                    HashMap hashMap2 = aVar2.c;
                    if (hashMap2 != null) {
                        for (Object obj2 : hashMap2.keySet()) {
                            ((e) hashMap2.get(obj2)).a();
                        }
                        hashMap2.clear();
                    }
                    HashMap hashMap3 = aVar2.f30016d;
                    if (hashMap3 != null) {
                        hashMap3.clear();
                    }
                    HashMap hashMap4 = aVar2.f30017e;
                    if (hashMap4 != null) {
                        hashMap4.clear();
                    }
                }
                this.nameLayout.clear();
            }
            Map<String, th.b> map2 = this.nameMaster;
            if (map2 != null) {
                map2.clear();
            }
            List<String> list2 = this.sldIds;
            if (list2 != null) {
                list2.clear();
            }
            e eVar = this.defaultStyle;
            if (eVar != null) {
                eVar.a();
            }
            ZipPackage zipPackage = this.zipPackage;
            if (zipPackage != null) {
                zipPackage.revert();
            }
            HyperlinkReader.instance().disposs();
            PictureReader.instance().dispose();
            LayoutReader.instance().dispose();
            MasterReader.instance().dispose();
            RunAttr.instance().dispose();
            BulletNumberManage.instance().dispose();
        }
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public Object getModel() {
        this.isReaderFinish = false;
        c cVar = this.pgModel;
        if (cVar != null) {
            this.isReaderFinish = true;
            return cVar;
        }
        initPackagePart();
        this.pgModel = new c();
        processPresentation();
        this.isReaderFinish = true;
        return this.pgModel;
    }

    public void initPackagePart() {
        ZipPackage zipPackage = new ZipPackage(this.filePath);
        this.zipPackage = zipPackage;
        PackageRelationship relationship = zipPackage.getRelationshipsByType(PackageRelationshipTypes.CORE_DOCUMENT).getRelationship(0);
        if (relationship != null && relationship.getTargetURI().toString().equals("/ppt/presentation.xml")) {
            this.packagePart = this.zipPackage.getPart(relationship);
            return;
        }
        throw new Exception("Format error");
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public boolean isReaderFinish() {
        List<String> list;
        c cVar = this.pgModel;
        if ((cVar == null || (list = this.sldIds) == null || this.abortReader || cVar.f30031e == 0 || this.currentReaderIndex >= list.size()) && this.isReaderFinish) {
            return true;
        }
        return false;
    }

    public void processMasterPart(Element element) {
        List elements = element.elements("sldMasterId");
        if (elements.size() > 0) {
            Element element2 = (Element) elements.get(0);
            if (this.abortReader) {
                return;
            }
            PackagePart part = this.zipPackage.getPart(this.packagePart.getRelationship(getUsefulAttributeValue(element2)).getTargetURI());
            this.nameMaster.put(part.getPartName().getName(), MasterReader.instance().getMasterData(this.control, this.zipPackage, part, this.pgModel));
        }
    }

    public void processSlidePart() {
        if (this.sldIds.size() > 0) {
            int min = Math.min(this.sldIds.size(), 2);
            for (int i10 = 0; i10 < min && !this.abortReader; i10++) {
                List<String> list = this.sldIds;
                int i11 = this.currentReaderIndex;
                this.currentReaderIndex = i11 + 1;
                processSlide(list.get(i11));
            }
            if (!isReaderFinish()) {
                new lib.zj.office.system.c(this, this.control).start();
                return;
            } else {
                this.control.r(805306376, Boolean.TRUE);
                return;
            }
        }
        throw new Exception("Format error");
    }

    @Override // lib.zj.office.system.b
    public boolean searchContent(File file, String str) {
        this.searched = false;
        this.key = str;
        ZipPackage zipPackage = new ZipPackage(file.getAbsolutePath());
        this.zipPackage = zipPackage;
        this.packagePart = this.zipPackage.getPart(zipPackage.getRelationshipsByType(PackageRelationshipTypes.CORE_DOCUMENT).getRelationship(0));
        SAXReader sAXReader = new SAXReader();
        try {
            InputStream inputStream = this.packagePart.getInputStream();
            sAXReader.addHandler("/presentation/sldIdLst/sldId", new PresentationSaxHandler_Search());
            sAXReader.read(inputStream);
            inputStream.close();
        } catch (StopReaderError unused) {
        } catch (Throwable th2) {
            sAXReader.resetHandlers();
            throw th2;
        }
        sAXReader.resetHandlers();
        this.key = null;
        this.zipPackage = null;
        this.packagePart = null;
        return this.searched;
    }

    public boolean searchContentForText(Element element, String str) {
        Element element2;
        String name = element.getName();
        if (name.equals("sp")) {
            StringBuilder sb2 = new StringBuilder();
            if ((!this.note || "body".equals(ReaderKit.instance().getPlaceholderType(element))) && (element2 = element.element("txBody")) != null) {
                for (Element element3 : element2.elements("p")) {
                    for (Element element4 : element3.elements("r")) {
                        Element element5 = element4.element("t");
                        if (element5 != null) {
                            sb2.append(element5.getText());
                        }
                    }
                    if (sb2.indexOf(str) >= 0) {
                        this.key = null;
                        this.zipPackage = null;
                        this.packagePart = null;
                        this.searched = true;
                        return true;
                    }
                    sb2.delete(0, sb2.length());
                }
            }
        } else if (name.equals("grpSp")) {
            Iterator elementIterator = element.elementIterator();
            while (elementIterator.hasNext()) {
                if (searchContentForText((Element) elementIterator.next(), str)) {
                    this.key = null;
                    this.zipPackage = null;
                    this.packagePart = null;
                    this.searched = true;
                    return true;
                }
            }
        }
        return false;
    }

    public void setPageSize(Element element) {
        float f10;
        float f11;
        if (element != null) {
            f10 = (Float.parseFloat(element.attributeValue("cx")) * 96.0f) / 914400.0f;
            f11 = (Float.parseFloat(element.attributeValue("cy")) * 96.0f) / 914400.0f;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.pgModel.c = new Dimension((int) f10, (int) f11);
    }

    /* loaded from: classes3.dex */
    public class PresentationSaxHandler implements ElementHandler {
        public PresentationSaxHandler() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            if (!((b) PPTXReader.this).abortReader) {
                Element current = elementPath.getCurrent();
                String name = current.getName();
                try {
                    if (name.equals("sldMasterIdLst")) {
                        PPTXReader.this.processMasterPart(current);
                    } else if (name.equals("defaultTextStyle")) {
                        PPTXReader.this.processDefaultTextStyle(current);
                    } else if (name.equals("sldSz")) {
                        PPTXReader.this.setPageSize(current);
                    } else if (name.equals("sldId")) {
                        PPTXReader.this.addSlideID(current);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                current.detach();
                return;
            }
            throw new AbortReaderError("abort Reader");
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onStart(ElementPath elementPath) {
        }
    }

    /* loaded from: classes3.dex */
    public class PresentationSaxHandler_Search implements ElementHandler {
        public PresentationSaxHandler_Search() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            if (!((b) PPTXReader.this).abortReader) {
                Element current = elementPath.getCurrent();
                if ("sldId".equals(current.getName())) {
                    PPTXReader.this.note = false;
                    PackagePart part = PPTXReader.this.zipPackage.getPart(PPTXReader.this.packagePart.getRelationship(PPTXReader.this.getUsefulAttributeValue(current)).getTargetURI());
                    if (part != null) {
                        SAXReader sAXReader = new SAXReader();
                        try {
                            try {
                                try {
                                    InputStream inputStream = part.getInputStream();
                                    SlideNoteSaxHandler_Search slideNoteSaxHandler_Search = new SlideNoteSaxHandler_Search();
                                    sAXReader.addHandler("/sld/cSld/spTree/sp", slideNoteSaxHandler_Search);
                                    sAXReader.addHandler("/sld/cSld/spTree/grpSp", slideNoteSaxHandler_Search);
                                    sAXReader.read(inputStream);
                                    inputStream.close();
                                    PackageRelationship relationship = part.getRelationshipsByType(PackageRelationshipTypes.NOTES_SLIDE).getRelationship(0);
                                    if (relationship != null) {
                                        PackagePart part2 = PPTXReader.this.zipPackage.getPart(relationship.getTargetURI());
                                        PPTXReader.this.note = true;
                                        InputStream inputStream2 = part2.getInputStream();
                                        sAXReader.resetHandlers();
                                        sAXReader.addHandler("/notes/cSld/spTree/sp", slideNoteSaxHandler_Search);
                                        sAXReader.read(inputStream2);
                                        inputStream2.close();
                                    }
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            } catch (StopReaderError unused) {
                                current.detach();
                                throw new StopReaderError("stop");
                            }
                        } finally {
                            sAXReader.resetHandlers();
                        }
                    }
                }
                current.detach();
                return;
            }
            throw new AbortReaderError("abort Reader");
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onStart(ElementPath elementPath) {
        }
    }

    /* loaded from: classes3.dex */
    public class SlideNoteSaxHandler_Search implements ElementHandler {
        public SlideNoteSaxHandler_Search() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            if (!((b) PPTXReader.this).abortReader) {
                Element current = elementPath.getCurrent();
                PPTXReader pPTXReader = PPTXReader.this;
                pPTXReader.searchContentForText(current, pPTXReader.key);
                current.detach();
                if (!PPTXReader.this.searched) {
                    return;
                }
                throw new StopReaderError("stop");
            }
            throw new AbortReaderError("abort Reader");
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onStart(ElementPath elementPath) {
        }
    }

    /* loaded from: classes3.dex */
    public class SlideSaxHandler implements ElementHandler {
        public SlideSaxHandler() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            boolean z10;
            String attributeValue;
            if (!((b) PPTXReader.this).abortReader) {
                Element current = elementPath.getCurrent();
                try {
                    if ("bg".equals(current.getName())) {
                        PPTXReader pPTXReader = PPTXReader.this;
                        pPTXReader.processBackground(pPTXReader.slidePart, PPTXReader.this.pgMaster, PPTXReader.this.pgLayout, PPTXReader.this.pgSlide, current);
                    } else if ("sld".equals(current.getName())) {
                        if (current.attribute("showMasterSp") != null && (attributeValue = current.attributeValue("showMasterSp")) != null && attributeValue.length() > 0 && Integer.valueOf(attributeValue).intValue() == 0) {
                            PPTXReader.this.showMasterSp = false;
                        }
                    } else if ("par".equals(current.getName())) {
                        PPTXReader pPTXReader2 = PPTXReader.this;
                        pPTXReader2.processSlideShow(pPTXReader2.pgSlide, current);
                    } else if ("transition".equals(current.getName())) {
                        d dVar = PPTXReader.this.pgSlide;
                        if (current.elements().size() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        dVar.f30043j = z10;
                    } else {
                        ShapeManage.instance().processShape(((b) PPTXReader.this).control, PPTXReader.this.zipPackage, PPTXReader.this.slidePart, PPTXReader.this.pgModel, PPTXReader.this.pgMaster, PPTXReader.this.pgLayout, PPTXReader.this.defaultStyle, PPTXReader.this.pgSlide, (byte) 2, current, null, 1.0f, 1.0f);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                current.detach();
                return;
            }
            throw new AbortReaderError("abort Reader");
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onStart(ElementPath elementPath) {
        }
    }
}

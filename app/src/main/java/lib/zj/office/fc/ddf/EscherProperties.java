package lib.zj.office.fc.ddf;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.fontbox.ttf.WGL4Names;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes3.dex */
public final class EscherProperties {
    public static final short BLIP__BLIPFILENAME = 261;
    public static final short BLIP__BLIPFLAGS = 262;
    public static final short BLIP__BLIPTODISPLAY = 260;
    public static final short BLIP__BRIGHTNESSSETTING = 265;
    public static final short BLIP__CONTRASTSETTING = 264;
    public static final short BLIP__CROPFROMBOTTOM = 257;
    public static final short BLIP__CROPFROMLEFT = 258;
    public static final short BLIP__CROPFROMRIGHT = 259;
    public static final short BLIP__CROPFROMTOP = 256;
    public static final short BLIP__DOUBLEMOD = 268;
    public static final short BLIP__GAMMA = 266;
    public static final short BLIP__NOHITTESTPICTURE = 316;
    public static final short BLIP__PICTUREACTIVE = 319;
    public static final short BLIP__PICTUREBILEVEL = 318;
    public static final short BLIP__PICTUREFILLMOD = 269;
    public static final short BLIP__PICTUREGRAY = 317;
    public static final short BLIP__PICTUREID = 267;
    public static final short BLIP__PICTURELINE = 270;
    public static final short BLIP__PRINTBLIP = 271;
    public static final short BLIP__PRINTBLIPFILENAME = 272;
    public static final short BLIP__PRINTFLAGS = 273;
    public static final short BLIP__TRANSPARENTCOLOR = 263;
    public static final short CALLOUT__CALLOUTACCENTBAR = 890;
    public static final short CALLOUT__CALLOUTANGLE = 834;
    public static final short CALLOUT__CALLOUTDROPSPECIFIED = 836;
    public static final short CALLOUT__CALLOUTDROPTYPE = 835;
    public static final short CALLOUT__CALLOUTLENGTHSPECIFIED = 837;
    public static final short CALLOUT__CALLOUTMINUSX = 892;
    public static final short CALLOUT__CALLOUTMINUSY = 893;
    public static final short CALLOUT__CALLOUTTEXTBORDER = 891;
    public static final short CALLOUT__CALLOUTTYPE = 832;
    public static final short CALLOUT__DROPAUTO = 894;
    public static final short CALLOUT__ISCALLOUT = 889;
    public static final short CALLOUT__LENGTHSPECIFIED = 895;
    public static final short CALLOUT__XYCALLOUTGAP = 833;
    public static final short FILL__ANGLE = 395;
    public static final short FILL__BACKOPACITY = 388;
    public static final short FILL__BLIPFILENAME = 391;
    public static final short FILL__BLIPFLAGS = 392;
    public static final short FILL__CRMOD = 389;
    public static final short FILL__DZTYPE = 405;
    public static final short FILL__FILLBACKCOLOR = 387;
    public static final short FILL__FILLCOLOR = 385;
    public static final short FILL__FILLED = 443;
    public static final short FILL__FILLOPACITY = 386;
    public static final short FILL__FILLTYPE = 384;
    public static final short FILL__FOCUS = 396;
    public static final short FILL__HEIGHT = 394;
    public static final short FILL__HITTESTFILL = 444;
    public static final short FILL__NOFILLHITTEST = 447;
    public static final short FILL__ORIGINX = 408;
    public static final short FILL__ORIGINY = 409;
    public static final short FILL__PATTERNTEXTURE = 390;
    public static final short FILL__RECTBOTTOM = 404;
    public static final short FILL__RECTLEFT = 401;
    public static final short FILL__RECTRIGHT = 403;
    public static final short FILL__RECTTOP = 402;
    public static final short FILL__SHADECOLORS = 407;
    public static final short FILL__SHADEPRESET = 406;
    public static final short FILL__SHADETYPE = 412;
    public static final short FILL__SHAPE = 445;
    public static final short FILL__SHAPEORIGINX = 410;
    public static final short FILL__SHAPEORIGINY = 411;
    public static final short FILL__TOBOTTOM = 400;
    public static final short FILL__TOLEFT = 397;
    public static final short FILL__TORIGHT = 399;
    public static final short FILL__TOTOP = 398;
    public static final short FILL__USERECT = 446;
    public static final short FILL__WIDTH = 393;
    public static final short GEOMETRY__3DOK = 379;
    public static final short GEOMETRY__ADJUST10VALUE = 336;
    public static final short GEOMETRY__ADJUST2VALUE = 328;
    public static final short GEOMETRY__ADJUST3VALUE = 329;
    public static final short GEOMETRY__ADJUST4VALUE = 330;
    public static final short GEOMETRY__ADJUST5VALUE = 331;
    public static final short GEOMETRY__ADJUST6VALUE = 332;
    public static final short GEOMETRY__ADJUST7VALUE = 333;
    public static final short GEOMETRY__ADJUST8VALUE = 334;
    public static final short GEOMETRY__ADJUST9VALUE = 335;
    public static final short GEOMETRY__ADJUSTVALUE = 327;
    public static final short GEOMETRY__BOTTOM = 323;
    public static final short GEOMETRY__FILLOK = 383;
    public static final short GEOMETRY__FILLSHADESHAPEOK = 382;
    public static final short GEOMETRY__GEOTEXTOK = 381;
    public static final short GEOMETRY__LEFT = 320;
    public static final short GEOMETRY__LINEOK = 380;
    public static final short GEOMETRY__RIGHT = 322;
    public static final short GEOMETRY__SEGMENTINFO = 326;
    public static final short GEOMETRY__SHADOWok = 378;
    public static final short GEOMETRY__SHAPEPATH = 324;
    public static final short GEOMETRY__TOP = 321;
    public static final short GEOMETRY__VERTICES = 325;
    public static final short GEOTEXT__ALIGNMENTONCURVE = 194;
    public static final short GEOTEXT__BOLDFONT = 250;
    public static final short GEOTEXT__CHARBOUNDINGBOX = 246;
    public static final short GEOTEXT__DEFAULTPOINTSIZE = 195;
    public static final short GEOTEXT__FONTFAMILYNAME = 197;
    public static final short GEOTEXT__HASTEXTEFFECT = 241;
    public static final short GEOTEXT__ITALICFONT = 251;
    public static final short GEOTEXT__KERNCHARACTERS = 243;
    public static final short GEOTEXT__NOMEASUREALONGPATH = 249;
    public static final short GEOTEXT__REVERSEROWORDER = 240;
    public static final short GEOTEXT__ROTATECHARACTERS = 242;
    public static final short GEOTEXT__RTFTEXT = 193;
    public static final short GEOTEXT__SCALETEXTONPATH = 247;
    public static final short GEOTEXT__SHADOWFONT = 253;
    public static final short GEOTEXT__SMALLCAPSFONT = 254;
    public static final short GEOTEXT__STRETCHCHARHEIGHT = 248;
    public static final short GEOTEXT__STRETCHTOFITSHAPE = 245;
    public static final short GEOTEXT__STRIKETHROUGHFONT = 255;
    public static final short GEOTEXT__TEXTSPACING = 196;
    public static final short GEOTEXT__TIGHTORTRACK = 244;
    public static final short GEOTEXT__UNDERLINEFONT = 252;
    public static final short GEOTEXT__UNICODE = 192;
    public static final short GROUPSHAPE__1DADJUSTMENT = 957;
    public static final short GROUPSHAPE__BEHINDDOCUMENT = 954;
    public static final short GROUPSHAPE__BORDERBOTTOMCOLOR = 925;
    public static final short GROUPSHAPE__BORDERLEFTCOLOR = 924;
    public static final short GROUPSHAPE__BORDERRIGHTCOLOR = 926;
    public static final short GROUPSHAPE__BORDERTOPCOLOR = 923;
    public static final short GROUPSHAPE__DESCRIPTION = 897;
    public static final short GROUPSHAPE__EDITEDWRAP = 953;
    public static final short GROUPSHAPE__FLAGS = 959;
    public static final short GROUPSHAPE__HIDDEN = 958;
    public static final short GROUPSHAPE__HR_ALIGN = 916;
    public static final short GROUPSHAPE__HR_HEIGHT = 917;
    public static final short GROUPSHAPE__HR_PCT = 915;
    public static final short GROUPSHAPE__HR_WIDTH = 918;
    public static final short GROUPSHAPE__HYPERLINK = 898;
    public static final short GROUPSHAPE__ISBUTTON = 956;
    public static final short GROUPSHAPE__METROBLOB = 937;
    public static final short GROUPSHAPE__ONDBLCLICKNOTIFY = 955;
    public static final short GROUPSHAPE__POSH = 911;
    public static final short GROUPSHAPE__POSRELH = 912;
    public static final short GROUPSHAPE__POSRELV = 914;
    public static final short GROUPSHAPE__POSV = 913;
    public static final short GROUPSHAPE__PRINT = 959;
    public static final short GROUPSHAPE__REGROUPID = 904;
    public static final short GROUPSHAPE__SCRIPT = 910;
    public static final short GROUPSHAPE__SCRIPTEXT = 919;
    public static final short GROUPSHAPE__SCRIPTLANG = 920;
    public static final short GROUPSHAPE__SHAPENAME = 896;
    public static final short GROUPSHAPE__TABLEPROPERTIES = 927;
    public static final short GROUPSHAPE__TABLEROWPROPERTIES = 928;
    public static final short GROUPSHAPE__TOOLTIP = 909;
    public static final short GROUPSHAPE__UNUSED906 = 906;
    public static final short GROUPSHAPE__WEBBOT = 933;
    public static final short GROUPSHAPE__WRAPDISTBOTTOM = 903;
    public static final short GROUPSHAPE__WRAPDISTLEFT = 900;
    public static final short GROUPSHAPE__WRAPDISTRIGHT = 902;
    public static final short GROUPSHAPE__WRAPDISTTOP = 901;
    public static final short GROUPSHAPE__WRAPPOLYGONVERTICES = 899;
    public static final short GROUPSHAPE__ZORDER = 938;
    public static final short LINESTYLE__ANYLINE = 508;
    public static final short LINESTYLE__ARROWHEADSOK = 507;
    public static final short LINESTYLE__BACKCOLOR = 450;
    public static final short LINESTYLE__COLOR = 448;
    public static final short LINESTYLE__CRMOD = 451;
    public static final short LINESTYLE__FILLBLIP = 453;
    public static final short LINESTYLE__FILLBLIPFLAGS = 455;
    public static final short LINESTYLE__FILLBLIPNAME = 454;
    public static final short LINESTYLE__FILLDZTYPE = 458;
    public static final short LINESTYLE__FILLHEIGHT = 457;
    public static final short LINESTYLE__FILLWIDTH = 456;
    public static final short LINESTYLE__HITLINETEST = 509;
    public static final short LINESTYLE__LINEDASHING = 462;
    public static final short LINESTYLE__LINEDASHSTYLE = 463;
    public static final short LINESTYLE__LINEENDARROWHEAD = 465;
    public static final short LINESTYLE__LINEENDARROWLENGTH = 469;
    public static final short LINESTYLE__LINEENDARROWWIDTH = 468;
    public static final short LINESTYLE__LINEENDCAPSTYLE = 471;
    public static final short LINESTYLE__LINEESTARTARROWLENGTH = 467;
    public static final short LINESTYLE__LINEFILLSHAPE = 510;
    public static final short LINESTYLE__LINEJOINSTYLE = 470;
    public static final short LINESTYLE__LINEMITERLIMIT = 460;
    public static final short LINESTYLE__LINESTARTARROWHEAD = 464;
    public static final short LINESTYLE__LINESTARTARROWWIDTH = 466;
    public static final short LINESTYLE__LINESTYLE = 461;
    public static final short LINESTYLE__LINETYPE = 452;
    public static final short LINESTYLE__LINEWIDTH = 459;
    public static final short LINESTYLE__NOLINEDRAWDASH = 511;
    public static final short LINESTYLE__OPACITY = 449;
    public static final short PERSPECTIVE__OFFSETX = 577;
    public static final short PERSPECTIVE__OFFSETY = 578;
    public static final short PERSPECTIVE__ORIGINX = 586;
    public static final short PERSPECTIVE__ORIGINY = 587;
    public static final short PERSPECTIVE__PERSPECTIVEON = 639;
    public static final short PERSPECTIVE__PERSPECTIVEX = 583;
    public static final short PERSPECTIVE__PERSPECTIVEY = 584;
    public static final short PERSPECTIVE__SCALEXTOX = 579;
    public static final short PERSPECTIVE__SCALEXTOY = 581;
    public static final short PERSPECTIVE__SCALEYTOX = 580;
    public static final short PERSPECTIVE__SCALEYTOY = 582;
    public static final short PERSPECTIVE__TYPE = 576;
    public static final short PERSPECTIVE__WEIGHT = 585;
    public static final short PROTECTION__LOCKADJUSTHANDLES = 126;
    public static final short PROTECTION__LOCKAGAINSTGROUPING = 127;
    public static final short PROTECTION__LOCKAGAINSTSELECT = 122;
    public static final short PROTECTION__LOCKASPECTRATIO = 120;
    public static final short PROTECTION__LOCKCROPPING = 123;
    public static final short PROTECTION__LOCKPOSITION = 121;
    public static final short PROTECTION__LOCKROTATION = 119;
    public static final short PROTECTION__LOCKTEXT = 125;
    public static final short PROTECTION__LOCKVERTICES = 124;
    public static final short SHADOWSTYLE__COLOR = 513;
    public static final short SHADOWSTYLE__CRMOD = 515;
    public static final short SHADOWSTYLE__HIGHLIGHT = 514;
    public static final short SHADOWSTYLE__OFFSETX = 517;
    public static final short SHADOWSTYLE__OFFSETY = 518;
    public static final short SHADOWSTYLE__OPACITY = 516;
    public static final short SHADOWSTYLE__ORIGINX = 528;
    public static final short SHADOWSTYLE__ORIGINY = 529;
    public static final short SHADOWSTYLE__PERSPECTIVEX = 525;
    public static final short SHADOWSTYLE__PERSPECTIVEY = 526;
    public static final short SHADOWSTYLE__SCALEXTOX = 521;
    public static final short SHADOWSTYLE__SCALEXTOY = 523;
    public static final short SHADOWSTYLE__SCALEYTOX = 522;
    public static final short SHADOWSTYLE__SCALEYTOY = 524;
    public static final short SHADOWSTYLE__SECONDOFFSETX = 519;
    public static final short SHADOWSTYLE__SECONDOFFSETY = 520;
    public static final short SHADOWSTYLE__SHADOW = 574;
    public static final short SHADOWSTYLE__SHADOWOBSURED = 575;
    public static final short SHADOWSTYLE__TYPE = 512;
    public static final short SHADOWSTYLE__WEIGHT = 527;
    public static final short SHAPE__BACKGROUNDSHAPE = 831;
    public static final short SHAPE__BLACKANDWHITESETTINGS = 772;
    public static final short SHAPE__CONNECTORSTYLE = 771;
    public static final short SHAPE__DELETEATTACHEDOBJECT = 830;
    public static final short SHAPE__LOCKSHAPETYPE = 828;
    public static final short SHAPE__MASTER = 769;
    public static final short SHAPE__OLEICON = 826;
    public static final short SHAPE__PREFERRELATIVERESIZE = 827;
    public static final short SHAPE__WMODEBW = 774;
    public static final short SHAPE__WMODEPUREBW = 773;
    public static final short TEXT__ANCHORTEXT = 135;
    public static final short TEXT__BIDIR = 139;
    public static final short TEXT__FONTROTATION = 137;
    public static final short TEXT__IDOFNEXTSHAPE = 138;
    public static final short TEXT__ROTATETEXTWITHSHAPE = 189;
    public static final short TEXT__SCALETEXT = 134;
    public static final short TEXT__SINGLECLICKSELECTS = 187;
    public static final short TEXT__SIZESHAPETOFITTEXT = 190;
    public static final short TEXT__SIZE_TEXT_TO_FIT_SHAPE = 191;
    public static final short TEXT__TEXTBOTTOM = 132;
    public static final short TEXT__TEXTFLOW = 136;
    public static final short TEXT__TEXTID = 128;
    public static final short TEXT__TEXTLEFT = 129;
    public static final short TEXT__TEXTRIGHT = 131;
    public static final short TEXT__TEXTTOP = 130;
    public static final short TEXT__USEHOSTMARGINS = 188;
    public static final short TEXT__WRAPTEXT = 133;
    public static final short THREEDSTYLE__AMBIENTINTENSITY = 722;
    public static final short THREEDSTYLE__CONSTRAINROTATION = 763;
    public static final short THREEDSTYLE__FILLHARSH = 767;
    public static final short THREEDSTYLE__FILLINTENSITY = 730;
    public static final short THREEDSTYLE__FILLX = 727;
    public static final short THREEDSTYLE__FILLY = 728;
    public static final short THREEDSTYLE__FILLZ = 729;
    public static final short THREEDSTYLE__KEYHARSH = 766;
    public static final short THREEDSTYLE__KEYINTENSITY = 726;
    public static final short THREEDSTYLE__KEYX = 723;
    public static final short THREEDSTYLE__KEYY = 724;
    public static final short THREEDSTYLE__KEYZ = 725;
    public static final short THREEDSTYLE__ORIGINX = 718;
    public static final short THREEDSTYLE__ORIGINY = 719;
    public static final short THREEDSTYLE__PARALLEL = 765;
    public static final short THREEDSTYLE__RENDERMODE = 713;
    public static final short THREEDSTYLE__ROTATIONANGLE = 709;
    public static final short THREEDSTYLE__ROTATIONAXISX = 706;
    public static final short THREEDSTYLE__ROTATIONAXISY = 707;
    public static final short THREEDSTYLE__ROTATIONAXISZ = 708;
    public static final short THREEDSTYLE__ROTATIONCENTERAUTO = 764;
    public static final short THREEDSTYLE__ROTATIONCENTERX = 710;
    public static final short THREEDSTYLE__ROTATIONCENTERY = 711;
    public static final short THREEDSTYLE__ROTATIONCENTERZ = 712;
    public static final short THREEDSTYLE__SKEWAMOUNT = 721;
    public static final short THREEDSTYLE__SKEWANGLE = 720;
    public static final short THREEDSTYLE__TOLERANCE = 714;
    public static final short THREEDSTYLE__XROTATIONANGLE = 705;
    public static final short THREEDSTYLE__XVIEWPOINT = 715;
    public static final short THREEDSTYLE__YROTATIONANGLE = 704;
    public static final short THREEDSTYLE__YVIEWPOINT = 716;
    public static final short THREEDSTYLE__ZVIEWPOINT = 717;
    public static final short THREED__3DEFFECT = 700;
    public static final short THREED__CRMOD = 648;
    public static final short THREED__DIFFUSEAMOUNT = 661;
    public static final short THREED__EDGETHICKNESS = 663;
    public static final short THREED__EXTRUDEBACKWARD = 665;
    public static final short THREED__EXTRUDEFORWARD = 664;
    public static final short THREED__EXTRUDEPLANE = 666;
    public static final short THREED__EXTRUSIONCOLOR = 667;
    public static final short THREED__LIGHTFACE = 703;
    public static final short THREED__METALLIC = 701;
    public static final short THREED__SHININESS = 662;
    public static final short THREED__SPECULARAMOUNT = 640;
    public static final short THREED__USEEXTRUSIONCOLOR = 702;
    public static final short TRANSFORM__ROTATION = 4;
    private static final Map<Short, EscherPropertyMetaData> properties = initProps();

    private static void addProp(Map<Short, EscherPropertyMetaData> map, int i10, String str) {
        map.put(Short.valueOf((short) i10), new EscherPropertyMetaData(str));
    }

    public static String getPropertyName(short s4) {
        EscherPropertyMetaData escherPropertyMetaData = properties.get(Short.valueOf(s4));
        if (escherPropertyMetaData == null) {
            return "unknown";
        }
        return escherPropertyMetaData.getDescription();
    }

    public static byte getPropertyType(short s4) {
        EscherPropertyMetaData escherPropertyMetaData = properties.get(Short.valueOf(s4));
        if (escherPropertyMetaData == null) {
            return (byte) 0;
        }
        return escherPropertyMetaData.getType();
    }

    private static Map<Short, EscherPropertyMetaData> initProps() {
        HashMap hashMap = new HashMap();
        addProp(hashMap, 4, "transform.rotation");
        addProp(hashMap, 119, "protection.lockrotation");
        addProp(hashMap, 120, "protection.lockaspectratio");
        addProp(hashMap, 121, "protection.lockposition");
        addProp(hashMap, 122, "protection.lockagainstselect");
        addProp(hashMap, 123, "protection.lockcropping");
        addProp(hashMap, 124, "protection.lockvertices");
        addProp(hashMap, 125, "protection.locktext");
        addProp(hashMap, 126, "protection.lockadjusthandles");
        addProp(hashMap, ShapeTypes.VERTICAL_SCROLL, "protection.lockagainstgrouping", (byte) 1);
        addProp(hashMap, 128, "text.textid");
        addProp(hashMap, 129, "text.textleft");
        addProp(hashMap, ShapeTypes.DOUBLE_WAVE, "text.texttop");
        addProp(hashMap, ShapeTypes.PLUS, "text.textright");
        addProp(hashMap, ShapeTypes.FLOW_CHART_PROCESS, "text.textbottom");
        addProp(hashMap, ShapeTypes.FLOW_CHART_DECISION, "text.wraptext");
        addProp(hashMap, ShapeTypes.FLOW_CHART_INPUT_OUTPUT, "text.scaletext");
        addProp(hashMap, ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS, "text.anchortext");
        addProp(hashMap, ShapeTypes.FLOW_CHART_INTERNAL_STORAGE, "text.textflow");
        addProp(hashMap, ShapeTypes.FLOW_CHART_DOCUMENT, "text.fontrotation");
        addProp(hashMap, ShapeTypes.FLOW_CHART_MULTIDOCUMENT, "text.idofnextshape");
        addProp(hashMap, ShapeTypes.FLOW_CHART_TERMINATOR, "text.bidir");
        addProp(hashMap, ShapeTypes.CHART_PLUS, "text.singleclickselects");
        addProp(hashMap, 188, "text.usehostmargins");
        addProp(hashMap, 189, "text.rotatetextwithshape");
        addProp(hashMap, 190, "text.sizeshapetofittext");
        addProp(hashMap, 191, "text.sizetexttofitshape", (byte) 1);
        addProp(hashMap, 192, "geotext.unicode");
        addProp(hashMap, 193, "geotext.rtftext");
        addProp(hashMap, 194, "geotext.alignmentoncurve");
        addProp(hashMap, 195, "geotext.defaultpointsize");
        addProp(hashMap, 196, "geotext.textspacing");
        addProp(hashMap, 197, "geotext.fontfamilyname");
        addProp(hashMap, 240, "geotext.reverseroworder");
        addProp(hashMap, 241, "geotext.hastexteffect");
        addProp(hashMap, 242, "geotext.rotatecharacters");
        addProp(hashMap, 243, "geotext.kerncharacters");
        addProp(hashMap, 244, "geotext.tightortrack");
        addProp(hashMap, 245, "geotext.stretchtofitshape");
        addProp(hashMap, 246, "geotext.charboundingbox");
        addProp(hashMap, 247, "geotext.scaletextonpath");
        addProp(hashMap, 248, "geotext.stretchcharheight");
        addProp(hashMap, 249, "geotext.nomeasurealongpath");
        addProp(hashMap, 250, "geotext.boldfont");
        addProp(hashMap, 251, "geotext.italicfont");
        addProp(hashMap, 252, "geotext.underlinefont");
        addProp(hashMap, 253, "geotext.shadowfont");
        addProp(hashMap, 254, "geotext.smallcapsfont");
        addProp(hashMap, FunctionEval.FunctionID.EXTERNAL_FUNC, "geotext.strikethroughfont");
        addProp(hashMap, 256, "blip.cropfromtop");
        addProp(hashMap, 257, "blip.cropfrombottom");
        addProp(hashMap, WGL4Names.NUMBER_OF_MAC_GLYPHS, "blip.cropfromleft");
        addProp(hashMap, 259, "blip.cropfromright");
        addProp(hashMap, 260, "blip.bliptodisplay");
        addProp(hashMap, 261, "blip.blipfilename");
        addProp(hashMap, 262, "blip.blipflags");
        addProp(hashMap, 263, "blip.transparentcolor");
        addProp(hashMap, 264, "blip.contrastsetting");
        addProp(hashMap, 265, "blip.brightnesssetting");
        addProp(hashMap, 266, "blip.gamma");
        addProp(hashMap, 267, "blip.pictureid");
        addProp(hashMap, 268, "blip.doublemod");
        addProp(hashMap, 269, "blip.picturefillmod");
        addProp(hashMap, 270, "blip.pictureline");
        addProp(hashMap, 271, "blip.printblip");
        addProp(hashMap, 272, "blip.printblipfilename");
        addProp(hashMap, 273, "blip.printflags");
        addProp(hashMap, 316, "blip.nohittestpicture");
        addProp(hashMap, 317, "blip.picturegray");
        addProp(hashMap, 318, "blip.picturebilevel");
        addProp(hashMap, 319, "blip.pictureactive");
        addProp(hashMap, 320, "geometry.left");
        addProp(hashMap, 321, "geometry.top");
        addProp(hashMap, 322, "geometry.right");
        addProp(hashMap, 323, "geometry.bottom");
        addProp(hashMap, 324, "geometry.shapepath", (byte) 3);
        addProp(hashMap, 325, "geometry.vertices", (byte) 5);
        addProp(hashMap, 326, "geometry.segmentinfo", (byte) 5);
        addProp(hashMap, 327, "geometry.adjustvalue");
        addProp(hashMap, 328, "geometry.adjust2value");
        addProp(hashMap, 329, "geometry.adjust3value");
        addProp(hashMap, 330, "geometry.adjust4value");
        addProp(hashMap, 331, "geometry.adjust5value");
        addProp(hashMap, 332, "geometry.adjust6value");
        addProp(hashMap, 333, "geometry.adjust7value");
        addProp(hashMap, 334, "geometry.adjust8value");
        addProp(hashMap, 335, "geometry.adjust9value");
        addProp(hashMap, 336, "geometry.adjust10value");
        addProp(hashMap, 378, "geometry.shadowOK");
        addProp(hashMap, 379, "geometry.3dok");
        addProp(hashMap, 380, "geometry.lineok");
        addProp(hashMap, 381, "geometry.geotextok");
        addProp(hashMap, 382, "geometry.fillshadeshapeok");
        addProp(hashMap, 383, "geometry.fillok", (byte) 1);
        addProp(hashMap, 384, "fill.filltype");
        addProp(hashMap, 385, "fill.fillcolor", (byte) 2);
        addProp(hashMap, 386, "fill.fillopacity");
        addProp(hashMap, 387, "fill.fillbackcolor", (byte) 2);
        addProp(hashMap, 388, "fill.backopacity");
        addProp(hashMap, 389, "fill.crmod");
        addProp(hashMap, 390, "fill.patterntexture");
        addProp(hashMap, 391, "fill.blipfilename");
        addProp(hashMap, 392, "fill.blipflags");
        addProp(hashMap, 393, "fill.width");
        addProp(hashMap, 394, "fill.height");
        addProp(hashMap, 395, "fill.angle");
        addProp(hashMap, 396, "fill.focus");
        addProp(hashMap, 397, "fill.toleft");
        addProp(hashMap, 398, "fill.totop");
        addProp(hashMap, 399, "fill.toright");
        addProp(hashMap, 400, "fill.tobottom");
        addProp(hashMap, TTAdConstant.MATE_IS_NULL_CODE, "fill.rectleft");
        addProp(hashMap, TTAdConstant.AD_ID_IS_NULL_CODE, "fill.recttop");
        addProp(hashMap, TTAdConstant.DEEPLINK_UNAVAILABLE_CODE, "fill.rectright");
        addProp(hashMap, TTAdConstant.DEEPLINK_FALLBACK_CODE, "fill.rectbottom");
        addProp(hashMap, TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE, "fill.dztype");
        addProp(hashMap, TTAdConstant.LANDING_PAGE_TYPE_CODE, "fill.shadepreset");
        addProp(hashMap, TTAdConstant.DOWNLOAD_APP_INFO_CODE, "fill.shadecolors", (byte) 5);
        addProp(hashMap, TTAdConstant.DOWNLOAD_URL_CODE, "fill.originx");
        addProp(hashMap, TTAdConstant.IMAGE_LIST_CODE, "fill.originy");
        addProp(hashMap, TTAdConstant.IMAGE_LIST_SIZE_CODE, "fill.shapeoriginx");
        addProp(hashMap, TTAdConstant.IMAGE_CODE, "fill.shapeoriginy");
        addProp(hashMap, TTAdConstant.IMAGE_URL_CODE, "fill.shadetype");
        addProp(hashMap, 443, "fill.filled");
        addProp(hashMap, 444, "fill.hittestfill");
        addProp(hashMap, 445, "fill.shape");
        addProp(hashMap, 446, "fill.userect");
        addProp(hashMap, 447, "fill.nofillhittest", (byte) 1);
        addProp(hashMap, 448, "linestyle.color", (byte) 2);
        addProp(hashMap, 449, "linestyle.opacity");
        addProp(hashMap, 450, "linestyle.backcolor", (byte) 2);
        addProp(hashMap, 451, "linestyle.crmod");
        addProp(hashMap, 452, "linestyle.linetype");
        addProp(hashMap, 453, "linestyle.fillblip");
        addProp(hashMap, 454, "linestyle.fillblipname");
        addProp(hashMap, 455, "linestyle.fillblipflags");
        addProp(hashMap, 456, "linestyle.fillwidth");
        addProp(hashMap, 457, "linestyle.fillheight");
        addProp(hashMap, 458, "linestyle.filldztype");
        addProp(hashMap, 459, "linestyle.linewidth");
        addProp(hashMap, 460, "linestyle.linemiterlimit");
        addProp(hashMap, 461, "linestyle.linestyle");
        addProp(hashMap, 462, "linestyle.linedashing");
        addProp(hashMap, 463, "linestyle.linedashstyle", (byte) 5);
        addProp(hashMap, 464, "linestyle.linestartarrowhead");
        addProp(hashMap, 465, "linestyle.lineendarrowhead");
        addProp(hashMap, 466, "linestyle.linestartarrowwidth");
        addProp(hashMap, 467, "linestyle.lineestartarrowlength");
        addProp(hashMap, 468, "linestyle.lineendarrowwidth");
        addProp(hashMap, 469, "linestyle.lineendarrowlength");
        addProp(hashMap, 470, "linestyle.linejoinstyle");
        addProp(hashMap, 471, "linestyle.lineendcapstyle");
        addProp(hashMap, 507, "linestyle.arrowheadsok");
        addProp(hashMap, 508, "linestyle.anyline");
        addProp(hashMap, 509, "linestyle.hitlinetest");
        addProp(hashMap, 510, "linestyle.linefillshape");
        addProp(hashMap, 511, "linestyle.nolinedrawdash", (byte) 1);
        addProp(hashMap, 512, "shadowstyle.type");
        addProp(hashMap, 513, "shadowstyle.color", (byte) 2);
        addProp(hashMap, 514, "shadowstyle.highlight");
        addProp(hashMap, 515, "shadowstyle.crmod");
        addProp(hashMap, 516, "shadowstyle.opacity");
        addProp(hashMap, 517, "shadowstyle.offsetx");
        addProp(hashMap, 518, "shadowstyle.offsety");
        addProp(hashMap, 519, "shadowstyle.secondoffsetx");
        addProp(hashMap, 520, "shadowstyle.secondoffsety");
        addProp(hashMap, 521, "shadowstyle.scalextox");
        addProp(hashMap, 522, "shadowstyle.scaleytox");
        addProp(hashMap, 523, "shadowstyle.scalextoy");
        addProp(hashMap, 524, "shadowstyle.scaleytoy");
        addProp(hashMap, 525, "shadowstyle.perspectivex");
        addProp(hashMap, 526, "shadowstyle.perspectivey");
        addProp(hashMap, 527, "shadowstyle.weight");
        addProp(hashMap, 528, "shadowstyle.originx");
        addProp(hashMap, 529, "shadowstyle.originy");
        addProp(hashMap, 574, "shadowstyle.shadow");
        addProp(hashMap, 575, "shadowstyle.shadowobsured");
        addProp(hashMap, 576, "perspective.type");
        addProp(hashMap, 577, "perspective.offsetx");
        addProp(hashMap, 578, "perspective.offsety");
        addProp(hashMap, 579, "perspective.scalextox");
        addProp(hashMap, 580, "perspective.scaleytox");
        addProp(hashMap, 581, "perspective.scalextoy");
        addProp(hashMap, 582, "perspective.scaleytoy");
        addProp(hashMap, 583, "perspective.perspectivex");
        addProp(hashMap, 584, "perspective.perspectivey");
        addProp(hashMap, 585, "perspective.weight");
        addProp(hashMap, 586, "perspective.originx");
        addProp(hashMap, 587, "perspective.originy");
        addProp(hashMap, 639, "perspective.perspectiveon");
        addProp(hashMap, 640, "3d.specularamount");
        addProp(hashMap, 661, "3d.diffuseamount");
        addProp(hashMap, 662, "3d.shininess");
        addProp(hashMap, 663, "3d.edgethickness");
        addProp(hashMap, 664, "3d.extrudeforward");
        addProp(hashMap, 665, "3d.extrudebackward");
        addProp(hashMap, TTAdConstant.STYLE_SIZE_RADIO_2_3, "3d.extrudeplane");
        addProp(hashMap, 667, "3d.extrusioncolor", (byte) 2);
        addProp(hashMap, 648, "3d.crmod");
        addProp(hashMap, OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD, "3d.3deffect");
        addProp(hashMap, 701, "3d.metallic");
        addProp(hashMap, 702, "3d.useextrusioncolor", (byte) 2);
        addProp(hashMap, 703, "3d.lightface");
        addProp(hashMap, 704, "3dstyle.yrotationangle");
        addProp(hashMap, 705, "3dstyle.xrotationangle");
        addProp(hashMap, 706, "3dstyle.rotationaxisx");
        addProp(hashMap, 707, "3dstyle.rotationaxisy");
        addProp(hashMap, 708, "3dstyle.rotationaxisz");
        addProp(hashMap, 709, "3dstyle.rotationangle");
        addProp(hashMap, 710, "3dstyle.rotationcenterx");
        addProp(hashMap, 711, "3dstyle.rotationcentery");
        addProp(hashMap, 712, "3dstyle.rotationcenterz");
        addProp(hashMap, 713, "3dstyle.rendermode");
        addProp(hashMap, 714, "3dstyle.tolerance");
        addProp(hashMap, 715, "3dstyle.xviewpoint");
        addProp(hashMap, 716, "3dstyle.yviewpoint");
        addProp(hashMap, 717, "3dstyle.zviewpoint");
        addProp(hashMap, 718, "3dstyle.originx");
        addProp(hashMap, 719, "3dstyle.originy");
        addProp(hashMap, 720, "3dstyle.skewangle");
        addProp(hashMap, 721, "3dstyle.skewamount");
        addProp(hashMap, 722, "3dstyle.ambientintensity");
        addProp(hashMap, 723, "3dstyle.keyx");
        addProp(hashMap, 724, "3dstyle.keyy");
        addProp(hashMap, 725, "3dstyle.keyz");
        addProp(hashMap, 726, "3dstyle.keyintensity");
        addProp(hashMap, 727, "3dstyle.fillx");
        addProp(hashMap, 728, "3dstyle.filly");
        addProp(hashMap, 729, "3dstyle.fillz");
        addProp(hashMap, 730, "3dstyle.fillintensity");
        addProp(hashMap, 763, "3dstyle.constrainrotation");
        addProp(hashMap, 764, "3dstyle.rotationcenterauto");
        addProp(hashMap, 765, "3dstyle.parallel");
        addProp(hashMap, 766, "3dstyle.keyharsh");
        addProp(hashMap, 767, "3dstyle.fillharsh");
        addProp(hashMap, 769, "shape.master");
        addProp(hashMap, 771, "shape.connectorstyle");
        addProp(hashMap, 772, "shape.blackandwhitesettings");
        addProp(hashMap, 773, "shape.wmodepurebw");
        addProp(hashMap, 774, "shape.wmodebw");
        addProp(hashMap, 826, "shape.oleicon");
        addProp(hashMap, 827, "shape.preferrelativeresize");
        addProp(hashMap, 828, "shape.lockshapetype");
        addProp(hashMap, 830, "shape.deleteattachedobject");
        addProp(hashMap, 831, "shape.backgroundshape");
        addProp(hashMap, 832, "callout.callouttype");
        addProp(hashMap, 833, "callout.xycalloutgap");
        addProp(hashMap, 834, "callout.calloutangle");
        addProp(hashMap, 835, "callout.calloutdroptype");
        addProp(hashMap, 836, "callout.calloutdropspecified");
        addProp(hashMap, 837, "callout.calloutlengthspecified");
        addProp(hashMap, 889, "callout.iscallout");
        addProp(hashMap, 890, "callout.calloutaccentbar");
        addProp(hashMap, 891, "callout.callouttextborder");
        addProp(hashMap, 892, "callout.calloutminusx");
        addProp(hashMap, 893, "callout.calloutminusy");
        addProp(hashMap, 894, "callout.dropauto");
        addProp(hashMap, 895, "callout.lengthspecified");
        addProp(hashMap, 896, "groupshape.shapename");
        addProp(hashMap, 897, "groupshape.description");
        addProp(hashMap, 898, "groupshape.hyperlink");
        addProp(hashMap, 899, "groupshape.wrappolygonvertices", (byte) 5);
        addProp(hashMap, OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK, "groupshape.wrapdistleft");
        addProp(hashMap, 901, "groupshape.wrapdisttop");
        addProp(hashMap, 902, "groupshape.wrapdistright");
        addProp(hashMap, 903, "groupshape.wrapdistbottom");
        addProp(hashMap, 904, "groupshape.regroupid");
        addProp(hashMap, 906, "unused906");
        addProp(hashMap, 909, "groupshape.wzTooltip");
        addProp(hashMap, 910, "groupshape.wzScript");
        addProp(hashMap, 911, "groupshape.posh");
        addProp(hashMap, 912, "groupshape.posrelh");
        addProp(hashMap, 913, "groupshape.posv");
        addProp(hashMap, 914, "groupshape.posrelv");
        addProp(hashMap, 915, "groupshape.pctHR");
        addProp(hashMap, 916, "groupshape.alignHR");
        addProp(hashMap, 917, "groupshape.dxHeightHR");
        addProp(hashMap, 918, "groupshape.dxWidthHR");
        addProp(hashMap, 919, "groupshape.wzScriptExtAttr");
        addProp(hashMap, 920, "groupshape.scriptLang");
        addProp(hashMap, 923, "groupshape.borderTopColor");
        addProp(hashMap, 924, "groupshape.borderLeftColor");
        addProp(hashMap, 925, "groupshape.borderBottomColor");
        addProp(hashMap, 926, "groupshape.borderRightColor");
        addProp(hashMap, 927, "groupshape.tableProperties");
        addProp(hashMap, 928, "groupshape.tableRowProperties");
        addProp(hashMap, 933, "groupshape.wzWebBot");
        addProp(hashMap, 937, "groupshape.metroBlob");
        addProp(hashMap, 938, "groupshape.dhgt");
        addProp(hashMap, 959, "groupshape.GroupShapeBooleanProperties");
        addProp(hashMap, 953, "groupshape.editedwrap");
        addProp(hashMap, 954, "groupshape.behinddocument");
        addProp(hashMap, 955, "groupshape.ondblclicknotify");
        addProp(hashMap, 956, "groupshape.isbutton");
        addProp(hashMap, 957, "groupshape.1dadjustment");
        addProp(hashMap, 958, "groupshape.hidden");
        addProp(hashMap, 959, "groupshape.print", (byte) 1);
        return hashMap;
    }

    private static void addProp(Map<Short, EscherPropertyMetaData> map, int i10, String str, byte b10) {
        map.put(Short.valueOf((short) i10), new EscherPropertyMetaData(str, b10));
    }
}

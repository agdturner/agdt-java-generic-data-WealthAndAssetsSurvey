/**
 * Source code generated by uk.ac.leeds.ccg.data.waascg.process.WaASCG_Main
 */

package uk.ac.leeds.ccg.data.waas.data.hhold;
import uk.ac.leeds.ccg.data.waas.data.id.WaAS_RecordID;

public class WaAS_W1HRecord extends WaAS_W1W2HRecord {

    protected int DVPEPV_SUM;

    protected byte GCONTMN;

    protected byte GCONTRC;

    protected int GCONTVL;

    protected byte HHLDR;

    protected byte HRPDVAGEW1BAND;

    protected short HRTBYR;

    protected int LANDOVSEAT_SUM;

    protected byte MDBEH;

    protected byte MDBEH2;

    protected boolean MDBEH3;

    protected byte MDCAP;

    protected byte MDCAP2;

    protected boolean MDCAP3;

    protected byte MDRST;

    protected byte MDRST2;

    protected boolean MDRST3;

    protected byte MDWPF;

    protected boolean MDWPF2;

    protected boolean MDWPF3;

    protected boolean MENDNUM3_I;

    protected boolean MENDNUM3_IFLAG;

    protected int MENDV11_I;

    protected boolean MENDV11_IFLAG;

    protected int MENDV5_I;

    protected boolean MENDV5_IFLAG;

    protected int MENDV7_I;

    protected boolean MENDV7_IFLAG;

    protected byte MENDW2;

    protected byte MEVER;

    protected int MNEG3_I;

    protected boolean MNEG3_IFLAG;

    protected byte NUMDEPCH;

    protected byte VCARO;

    protected byte VCARW;

    protected byte VMODU;

    protected boolean VNUMV;

    protected boolean VNUMV2;

    protected boolean VNUMV3;

    protected boolean VNUMV4;

    protected boolean VNUMV5;

    protected boolean VPERS2;

    protected boolean VPERS3;

    protected boolean VPERS4;

    protected boolean VPERS5;

    protected byte VPERS6;

    protected byte VPERS6_I;

    protected boolean VPERS6_IFLAG;

    protected boolean VSHPCT;

    protected byte VSHPCT2;

    protected boolean VSHPCT3;

    protected boolean VSHPCT4;

    protected boolean VSHPCT5;

    protected double XS_WGT;

    protected final void initDVPEPV_SUM(String s) {
        if (!s.trim().isEmpty()) {
            DVPEPV_SUM = Integer.parseInt(s);
        } else {
            DVPEPV_SUM = Integer.MIN_VALUE;
        }
    }

    protected final void initGCONTMN(String s) {
        if (!s.trim().isEmpty()) {
            GCONTMN = Byte.parseByte(s);
        } else {
            GCONTMN = Byte.MIN_VALUE;
        }
    }

    protected final void initGCONTRC(String s) {
        if (!s.trim().isEmpty()) {
            GCONTRC = Byte.parseByte(s);
        } else {
            GCONTRC = Byte.MIN_VALUE;
        }
    }

    protected final void initGCONTVL(String s) {
        if (!s.trim().isEmpty()) {
            GCONTVL = Integer.parseInt(s);
        } else {
            GCONTVL = Integer.MIN_VALUE;
        }
    }

    protected final void initHHLDR(String s) {
        if (!s.trim().isEmpty()) {
            HHLDR = Byte.parseByte(s);
        } else {
            HHLDR = Byte.MIN_VALUE;
        }
    }

    protected final void initHRPDVAGEW1BAND(String s) {
        if (!s.trim().isEmpty()) {
            HRPDVAGEW1BAND = Byte.parseByte(s);
        } else {
            HRPDVAGEW1BAND = Byte.MIN_VALUE;
        }
    }

    protected final void initHRTBYR(String s) {
        if (!s.trim().isEmpty()) {
            HRTBYR = Short.parseShort(s);
        } else {
            HRTBYR = Short.MIN_VALUE;
        }
    }

    protected final void initLANDOVSEAT_SUM(String s) {
        if (!s.trim().isEmpty()) {
            LANDOVSEAT_SUM = Integer.parseInt(s);
        } else {
            LANDOVSEAT_SUM = Integer.MIN_VALUE;
        }
    }

    protected final void initMDBEH(String s) {
        if (!s.trim().isEmpty()) {
            MDBEH = Byte.parseByte(s);
        } else {
            MDBEH = Byte.MIN_VALUE;
        }
    }

    protected final void initMDBEH2(String s) {
        if (!s.trim().isEmpty()) {
            MDBEH2 = Byte.parseByte(s);
        } else {
            MDBEH2 = Byte.MIN_VALUE;
        }
    }

    protected final void initMDBEH3(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                MDBEH3 = false;
            } else {
                MDBEH3 = true;
            }
        }
    }

    protected final void initMDCAP(String s) {
        if (!s.trim().isEmpty()) {
            MDCAP = Byte.parseByte(s);
        } else {
            MDCAP = Byte.MIN_VALUE;
        }
    }

    protected final void initMDCAP2(String s) {
        if (!s.trim().isEmpty()) {
            MDCAP2 = Byte.parseByte(s);
        } else {
            MDCAP2 = Byte.MIN_VALUE;
        }
    }

    protected final void initMDCAP3(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                MDCAP3 = false;
            } else {
                MDCAP3 = true;
            }
        }
    }

    protected final void initMDRST(String s) {
        if (!s.trim().isEmpty()) {
            MDRST = Byte.parseByte(s);
        } else {
            MDRST = Byte.MIN_VALUE;
        }
    }

    protected final void initMDRST2(String s) {
        if (!s.trim().isEmpty()) {
            MDRST2 = Byte.parseByte(s);
        } else {
            MDRST2 = Byte.MIN_VALUE;
        }
    }

    protected final void initMDRST3(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                MDRST3 = false;
            } else {
                MDRST3 = true;
            }
        }
    }

    protected final void initMDWPF(String s) {
        if (!s.trim().isEmpty()) {
            MDWPF = Byte.parseByte(s);
        } else {
            MDWPF = Byte.MIN_VALUE;
        }
    }

    protected final void initMDWPF2(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                MDWPF2 = false;
            } else {
                MDWPF2 = true;
            }
        }
    }

    protected final void initMDWPF3(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                MDWPF3 = false;
            } else {
                MDWPF3 = true;
            }
        }
    }

    protected final void initMENDNUM3_I(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                MENDNUM3_I = false;
            } else {
                MENDNUM3_I = true;
            }
        }
    }

    protected final void initMENDNUM3_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                MENDNUM3_IFLAG = false;
            } else {
                MENDNUM3_IFLAG = true;
            }
        }
    }

    protected final void initMENDV11_I(String s) {
        if (!s.trim().isEmpty()) {
            MENDV11_I = Integer.parseInt(s);
        } else {
            MENDV11_I = Integer.MIN_VALUE;
        }
    }

    protected final void initMENDV11_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                MENDV11_IFLAG = false;
            } else {
                MENDV11_IFLAG = true;
            }
        }
    }

    protected final void initMENDV5_I(String s) {
        if (!s.trim().isEmpty()) {
            MENDV5_I = Integer.parseInt(s);
        } else {
            MENDV5_I = Integer.MIN_VALUE;
        }
    }

    protected final void initMENDV5_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                MENDV5_IFLAG = false;
            } else {
                MENDV5_IFLAG = true;
            }
        }
    }

    protected final void initMENDV7_I(String s) {
        if (!s.trim().isEmpty()) {
            MENDV7_I = Integer.parseInt(s);
        } else {
            MENDV7_I = Integer.MIN_VALUE;
        }
    }

    protected final void initMENDV7_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                MENDV7_IFLAG = false;
            } else {
                MENDV7_IFLAG = true;
            }
        }
    }

    protected final void initMENDW2(String s) {
        if (!s.trim().isEmpty()) {
            MENDW2 = Byte.parseByte(s);
        } else {
            MENDW2 = Byte.MIN_VALUE;
        }
    }

    protected final void initMEVER(String s) {
        if (!s.trim().isEmpty()) {
            MEVER = Byte.parseByte(s);
        } else {
            MEVER = Byte.MIN_VALUE;
        }
    }

    protected final void initMNEG3_I(String s) {
        if (!s.trim().isEmpty()) {
            MNEG3_I = Integer.parseInt(s);
        } else {
            MNEG3_I = Integer.MIN_VALUE;
        }
    }

    protected final void initMNEG3_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                MNEG3_IFLAG = false;
            } else {
                MNEG3_IFLAG = true;
            }
        }
    }

    protected final void initNUMDEPCH(String s) {
        if (!s.trim().isEmpty()) {
            NUMDEPCH = Byte.parseByte(s);
        } else {
            NUMDEPCH = Byte.MIN_VALUE;
        }
    }

    protected final void initVCARO(String s) {
        if (!s.trim().isEmpty()) {
            VCARO = Byte.parseByte(s);
        } else {
            VCARO = Byte.MIN_VALUE;
        }
    }

    protected final void initVCARW(String s) {
        if (!s.trim().isEmpty()) {
            VCARW = Byte.parseByte(s);
        } else {
            VCARW = Byte.MIN_VALUE;
        }
    }

    protected final void initVMODU(String s) {
        if (!s.trim().isEmpty()) {
            VMODU = Byte.parseByte(s);
        } else {
            VMODU = Byte.MIN_VALUE;
        }
    }

    protected final void initVNUMV(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                VNUMV = false;
            } else {
                VNUMV = true;
            }
        }
    }

    protected final void initVNUMV2(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                VNUMV2 = false;
            } else {
                VNUMV2 = true;
            }
        }
    }

    protected final void initVNUMV3(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                VNUMV3 = false;
            } else {
                VNUMV3 = true;
            }
        }
    }

    protected final void initVNUMV4(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                VNUMV4 = false;
            } else {
                VNUMV4 = true;
            }
        }
    }

    protected final void initVNUMV5(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                VNUMV5 = false;
            } else {
                VNUMV5 = true;
            }
        }
    }

    protected final void initVPERS2(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                VPERS2 = false;
            } else {
                VPERS2 = true;
            }
        }
    }

    protected final void initVPERS3(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                VPERS3 = false;
            } else {
                VPERS3 = true;
            }
        }
    }

    protected final void initVPERS4(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                VPERS4 = false;
            } else {
                VPERS4 = true;
            }
        }
    }

    protected final void initVPERS5(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                VPERS5 = false;
            } else {
                VPERS5 = true;
            }
        }
    }

    protected final void initVPERS6(String s) {
        if (!s.trim().isEmpty()) {
            VPERS6 = Byte.parseByte(s);
        } else {
            VPERS6 = Byte.MIN_VALUE;
        }
    }

    protected final void initVPERS6_I(String s) {
        if (!s.trim().isEmpty()) {
            VPERS6_I = Byte.parseByte(s);
        } else {
            VPERS6_I = Byte.MIN_VALUE;
        }
    }

    protected final void initVPERS6_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                VPERS6_IFLAG = false;
            } else {
                VPERS6_IFLAG = true;
            }
        }
    }

    protected final void initVSHPCT(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                VSHPCT = false;
            } else {
                VSHPCT = true;
            }
        }
    }

    protected final void initVSHPCT2(String s) {
        if (!s.trim().isEmpty()) {
            VSHPCT2 = Byte.parseByte(s);
        } else {
            VSHPCT2 = Byte.MIN_VALUE;
        }
    }

    protected final void initVSHPCT3(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                VSHPCT3 = false;
            } else {
                VSHPCT3 = true;
            }
        }
    }

    protected final void initVSHPCT4(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                VSHPCT4 = false;
            } else {
                VSHPCT4 = true;
            }
        }
    }

    protected final void initVSHPCT5(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                VSHPCT5 = false;
            } else {
                VSHPCT5 = true;
            }
        }
    }

    protected final void initXS_WGT(String s) {
        if (!s.trim().isEmpty()) {
            XS_WGT = Double.parseDouble(s);
        } else {
            XS_WGT = Double.NaN;
        }
    }

    public int getDVPEPV_SUM() {
        return DVPEPV_SUM;
    }

    public byte getGCONTMN() {
        return GCONTMN;
    }

    public byte getGCONTRC() {
        return GCONTRC;
    }

    public int getGCONTVL() {
        return GCONTVL;
    }

    public byte getHHLDR() {
        return HHLDR;
    }

    public byte getHRPDVAGEW1BAND() {
        return HRPDVAGEW1BAND;
    }

    public short getHRTBYR() {
        return HRTBYR;
    }

    public int getLANDOVSEAT_SUM() {
        return LANDOVSEAT_SUM;
    }

    public byte getMDBEH() {
        return MDBEH;
    }

    public byte getMDBEH2() {
        return MDBEH2;
    }

    public boolean getMDBEH3() {
        return MDBEH3;
    }

    public byte getMDCAP() {
        return MDCAP;
    }

    public byte getMDCAP2() {
        return MDCAP2;
    }

    public boolean getMDCAP3() {
        return MDCAP3;
    }

    public byte getMDRST() {
        return MDRST;
    }

    public byte getMDRST2() {
        return MDRST2;
    }

    public boolean getMDRST3() {
        return MDRST3;
    }

    public byte getMDWPF() {
        return MDWPF;
    }

    public boolean getMDWPF2() {
        return MDWPF2;
    }

    public boolean getMDWPF3() {
        return MDWPF3;
    }

    public boolean getMENDNUM3_I() {
        return MENDNUM3_I;
    }

    public boolean getMENDNUM3_IFLAG() {
        return MENDNUM3_IFLAG;
    }

    public int getMENDV11_I() {
        return MENDV11_I;
    }

    public boolean getMENDV11_IFLAG() {
        return MENDV11_IFLAG;
    }

    public int getMENDV5_I() {
        return MENDV5_I;
    }

    public boolean getMENDV5_IFLAG() {
        return MENDV5_IFLAG;
    }

    public int getMENDV7_I() {
        return MENDV7_I;
    }

    public boolean getMENDV7_IFLAG() {
        return MENDV7_IFLAG;
    }

    public byte getMENDW2() {
        return MENDW2;
    }

    public byte getMEVER() {
        return MEVER;
    }

    public int getMNEG3_I() {
        return MNEG3_I;
    }

    public boolean getMNEG3_IFLAG() {
        return MNEG3_IFLAG;
    }

    public byte getNUMDEPCH() {
        return NUMDEPCH;
    }

    public byte getVCARO() {
        return VCARO;
    }

    public byte getVCARW() {
        return VCARW;
    }

    public byte getVMODU() {
        return VMODU;
    }

    public boolean getVNUMV() {
        return VNUMV;
    }

    public boolean getVNUMV2() {
        return VNUMV2;
    }

    public boolean getVNUMV3() {
        return VNUMV3;
    }

    public boolean getVNUMV4() {
        return VNUMV4;
    }

    public boolean getVNUMV5() {
        return VNUMV5;
    }

    public boolean getVPERS2() {
        return VPERS2;
    }

    public boolean getVPERS3() {
        return VPERS3;
    }

    public boolean getVPERS4() {
        return VPERS4;
    }

    public boolean getVPERS5() {
        return VPERS5;
    }

    public byte getVPERS6() {
        return VPERS6;
    }

    public byte getVPERS6_I() {
        return VPERS6_I;
    }

    public boolean getVPERS6_IFLAG() {
        return VPERS6_IFLAG;
    }

    public boolean getVSHPCT() {
        return VSHPCT;
    }

    public byte getVSHPCT2() {
        return VSHPCT2;
    }

    public boolean getVSHPCT3() {
        return VSHPCT3;
    }

    public boolean getVSHPCT4() {
        return VSHPCT4;
    }

    public boolean getVSHPCT5() {
        return VSHPCT5;
    }

    public double getXS_WGT() {
        return XS_WGT;
    }


    public WaAS_W1HRecord(WaAS_RecordID i, String line) throws Exception {
        super(i);
        s = line.split("\t");
        initXS_WGT(s[0]);
        initHOUT(s[1]);
        initACCOM(s[2]);
        initACCOTH(s[3]);
        initDVVESTV2_I(s[4]);
        initDVVESTV2_IFLAG(s[5]);
        initDVVESTV3_I(s[6]);
        initDVVESTV3_IFLAG(s[7]);
        initDVVESTV_I(s[8]);
        initDVVESTV_IFLAG(s[9]);
        initDVVOVAL_I(s[10]);
        initDVVOVAL_IFLAG(s[11]);
        initDVVPERV_I(s[12]);
        initDVVPERV_IFLAG(s[13]);
        initEINTPAY(s[14]);
        initEINTRAT(s[15]);
        initEINTRAT_I(s[16]);
        initEINTRAT_IFLAG(s[17]);
        initEOTHIRR(s[18]);
        initEOTHIVA(s[19]);
        initEOTHIVB(s[20]);
        initEOTHREG(s[21]);
        initEOTHRVA(s[22]);
        initEOTHRVB(s[23]);
        initEPRPER(s[24]);
        initEPRVAL(s[25]);
        initEPRVPAY(s[26]);
        initEQFILTER(s[27]);
        initEQREAS1(s[28]);
        initEQREAS2(s[29]);
        initEQREAS3(s[30]);
        initEQREAS4(s[31]);
        initEQREL(s[32]);
        initEQREL_I(s[33]);
        initEQREL_IFLAG(s[34]);
        initEQTYPE(s[35]);
        initEQTYPE_I(s[36]);
        initEQTYPE_IFLAG(s[37]);
        initEQVALB(s[38]);
        initEQVAL(s[39]);
        initEQVAL_I(s[40]);
        initEQVAL_IFLAG(s[41]);
        initEQWHEN(s[42]);
        initEQYES(s[43]);
        initEQYES_I(s[44]);
        initEQYES_IFLAG(s[45]);
        initERECMB(s[46]);
        initERECM(s[47]);
        initERECTAX(s[48]);
        initERENTAM(s[49]);
        initERENTB(s[50]);
        initERVPRP(s[51]);
        initERVPRP_I(s[52]);
        initERVPRP_IFLAG(s[53]);
        initERVRECB(s[54]);
        initERVREC(s[55]);
        initERVREG(s[56]);
        initERVRENT(s[57]);
        initERVSUMB(s[58]);
        initERVSUM(s[59]);
        initERVTAX(s[60]);
        initFLTTYP(s[61]);
        initFURN(s[62]);
        initGCOLLEC(s[63]);
        initGCOLLEC_I(s[64]);
        initGCOLLEC_IFLAG(s[65]);
        initGCOLLVB(s[66]);
        initGCOLLV(s[67]);
        initGCOLLV_I(s[68]);
        initGCOLLV_IFLAG(s[69]);
        initGCONTMN(s[70]);
        initGCONTRC(s[71]);
        initGCONTVB(s[72]);
        initGCONTVB_I(s[73]);
        initGCONTVB_IFLAG(s[74]);
        initGCONTVLS2(s[75]);
        initGCONTVL(s[76]);
        initGCPREAM(s[77]);
        initHAGEB(s[78]);
        initHAGEYR(s[79]);
        initHBFROM(s[80]);
        initHBUYSE(s[81]);
        initHBUYYR(s[82]);
        initHHOSCH(s[83]);
        initHHOWN(s[84]);
        initHPRICEB(s[85]);
        initHPRICE(s[86]);
        initHRTBEV(s[87]);
        initHRTBYR(s[88]);
        initHSETYPE(s[89]);
        initHSHAREP(s[90]);
        initHSHAREP_I(s[91]);
        initHSHAREP_IFLAG(s[92]);
        initHSHARE(s[93]);
        initHSHARE_I(s[94]);
        initHSHARE_IFLAG(s[95]);
        initHVALB(s[96]);
        initHVALRS1(s[97]);
        initHVALRS2(s[98]);
        initHVALRS3(s[99]);
        initHVALRS4(s[100]);
        initHVALRS5(s[101]);
        initHVALUE(s[102]);
        initHVALUE_I(s[103]);
        initHVALUE_IFLAG(s[104]);
        initLLORD(s[105]);
        initMALL2(s[106]);
        initMALL2_I(s[107]);
        initMALL2_IFLAG(s[108]);
        initMALL3(s[109]);
        initMALL3_I(s[110]);
        initMALL3_IFLAG(s[111]);
        initMALLTY2(s[112]);
        initMALLTY2_I(s[113]);
        initMALLTY2_IFLAG(s[114]);
        initMALLTY3(s[115]);
        initMALLTY3_I(s[116]);
        initMALLTY3_IFLAG(s[117]);
        initMALLTY(s[118]);
        initMALLTY_I(s[119]);
        initMALLTY_IFLAG(s[120]);
        initMALL(s[121]);
        initMALL_I(s[122]);
        initMALL_IFLAG(s[123]);
        initMARRS2(s[124]);
        initMARRS3(s[125]);
        initMARRS(s[126]);
        initMDBEH2(s[127]);
        initMDBEH3(s[128]);
        initMDBEH(s[129]);
        initMDCAP2(s[130]);
        initMDCAP3(s[131]);
        initMDCAP(s[132]);
        initMDIFFPY(s[133]);
        initMDRST2(s[134]);
        initMDRST3(s[135]);
        initMDRST(s[136]);
        initMDWPF2(s[137]);
        initMDWPF3(s[138]);
        initMDWPF(s[139]);
        initMENDNUM2(s[140]);
        initMENDNUM2_I(s[141]);
        initMENDNUM2_IFLAG(s[142]);
        initMENDNUM3(s[143]);
        initMENDNUM3_I(s[144]);
        initMENDNUM3_IFLAG(s[145]);
        initMENDNUM(s[146]);
        initMENDNUM_I(s[147]);
        initMENDNUM_IFLAG(s[148]);
        initMENDV11(s[149]);
        initMENDV11_I(s[150]);
        initMENDV11_IFLAG(s[151]);
        initMENDV2(s[152]);
        initMENDV2_I(s[153]);
        initMENDV2_IFLAG(s[154]);
        initMENDV3(s[155]);
        initMENDV3_I(s[156]);
        initMENDV3_IFLAG(s[157]);
        initMENDV4(s[158]);
        initMENDV4_I(s[159]);
        initMENDV4_IFLAG(s[160]);
        initMENDV5(s[161]);
        initMENDV5_I(s[162]);
        initMENDV5_IFLAG(s[163]);
        initMENDV6(s[164]);
        initMENDV6_I(s[165]);
        initMENDV6_IFLAG(s[166]);
        initMENDV7(s[167]);
        initMENDV7_I(s[168]);
        initMENDV7_IFLAG(s[169]);
        initMENDV8(s[170]);
        initMENDVB11(s[171]);
        initMENDVB2(s[172]);
        initMENDVB3(s[173]);
        initMENDVB4(s[174]);
        initMENDVB5(s[175]);
        initMENDVB6(s[176]);
        initMENDVB7(s[177]);
        initMENDVB8(s[178]);
        initMENDVB(s[179]);
        initMENDV(s[180]);
        initMENDV_I(s[181]);
        initMENDV_IFLAG(s[182]);
        initMENDW2(s[183]);
        initMENDW2_I(s[184]);
        initMENDW2_IFLAG(s[185]);
        initMENDW3(s[186]);
        initMENDW3_I(s[187]);
        initMENDW3_IFLAG(s[188]);
        initMENDW(s[189]);
        initMENDW_I(s[190]);
        initMENDW_IFLAG(s[191]);
        initMENDX2(s[192]);
        initMENDX3(s[193]);
        initMENDX(s[194]);
        initMENDY11(s[195]);
        initMENDY2(s[196]);
        initMENDY3(s[197]);
        initMENDY4(s[198]);
        initMENDY5(s[199]);
        initMENDY6(s[200]);
        initMENDY7(s[201]);
        initMENDY8(s[202]);
        initMENDY(s[203]);
        initMEVER(s[204]);
        initMHOWPY2(s[205]);
        initMHOWPY3(s[206]);
        initMHOWPY(s[207]);
        initMINC11(s[208]);
        initMINC12(s[209]);
        initMINC1(s[210]);
        initMINC2(s[211]);
        initMINC3(s[212]);
        initMINC4(s[213]);
        initMINC5(s[214]);
        initMINC6(s[215]);
        initMINC7(s[216]);
        initMINC8(s[217]);
        initMINC9(s[218]);
        initMJNAME01(s[219]);
        initMJNAME02(s[220]);
        initMJNAME03(s[221]);
        initMJNAME04(s[222]);
        initMJNAME18(s[223]);
        initMJNAME19(s[224]);
        initMJNAME20(s[225]);
        initMJNAME35(s[226]);
        initMJNAME36(s[227]);
        initMNAME2(s[228]);
        initMNAME3(s[229]);
        initMNAME(s[230]);
        initMNEG2(s[231]);
        initMNEG2_I(s[232]);
        initMNEG2_IFLAG(s[233]);
        initMNEG3(s[234]);
        initMNEG3_I(s[235]);
        initMNEG3_IFLAG(s[236]);
        initMNEGB2(s[237]);
        initMNEGB3(s[238]);
        initMNEGB(s[239]);
        initMNEG(s[240]);
        initMNEG_I(s[241]);
        initMNEG_IFLAG(s[242]);
        initMNUMB(s[243]);
        initMONAME2(s[244]);
        initMONAME3(s[245]);
        initMONAME(s[246]);
        initMPAYB2(s[247]);
        initMPAYB3(s[248]);
        initMPAYB(s[249]);
        initMPAYM2(s[250]);
        initMPAYM3(s[251]);
        initMPAYM(s[252]);
        initMPP2(s[253]);
        initMPP3(s[254]);
        initMPP(s[255]);
        initMREAS01(s[256]);
        initMREAS02(s[257]);
        initMREAS03(s[258]);
        initMREAS04(s[259]);
        initMREAS05(s[260]);
        initMREAS06(s[261]);
        initMREAS07(s[262]);
        initMREAS08(s[263]);
        initMREAS09(s[264]);
        initMREAS11(s[265]);
        initMREAS12(s[266]);
        initMREAS13(s[267]);
        initMREAS21(s[268]);
        initMREAS22(s[269]);
        initMREAS23(s[270]);
        initMTYPE2(s[271]);
        initMTYPE2_I(s[272]);
        initMTYPE2_IFLAG(s[273]);
        initMTYPE3(s[274]);
        initMTYPE3_I(s[275]);
        initMTYPE3_IFLAG(s[276]);
        initMTYPE(s[277]);
        initMTYPE_I(s[278]);
        initMTYPE_IFLAG(s[279]);
        initMVAL2(s[280]);
        initMVAL2_I(s[281]);
        initMVAL2_IFLAG(s[282]);
        initMVAL3(s[283]);
        initMVAL3_I(s[284]);
        initMVAL3_IFLAG(s[285]);
        initMVALB2(s[286]);
        initMVALB3(s[287]);
        initMVALB(s[288]);
        initMVAL(s[289]);
        initMVAL_I(s[290]);
        initMVAL_IFLAG(s[291]);
        initMYLFT2(s[292]);
        initMYLFT3(s[293]);
        initMYLFT(s[294]);
        initNUMCIVPTR(s[295]);
        initNVESTV(s[296]);
        initOFINAL(s[297]);
        initOTHMORT(s[298]);
        initTEN1(s[299]);
        initTEN1_I(s[300]);
        initTEN1_IFLAG(s[301]);
        initTIED(s[302]);
        initVCARN(s[303]);
        initVCARN_I(s[304]);
        initVCARN_IFLAG(s[305]);
        initVCARO(s[306]);
        initVCARW(s[307]);
        initVESTV2(s[308]);
        initVESTV2_I(s[309]);
        initVESTV2_IFLAG(s[310]);
        initVESTV(s[311]);
        initVESTV_I(s[312]);
        initVESTV_IFLAG(s[313]);
        initVESVB2(s[314]);
        initVESVB(s[315]);
        initVMODU(s[316]);
        initVNUMV2(s[317]);
        initVNUMV3(s[318]);
        initVNUMV4(s[319]);
        initVNUMV5(s[320]);
        initVNUMV(s[321]);
        initVOTHT(s[322]);
        initVOTHT_I(s[323]);
        initVOTHT_IFLAG(s[324]);
        initVOTYP1(s[325]);
        initVOTYP1_I(s[326]);
        initVOTYP1_IFLAG(s[327]);
        initVOTYP2(s[328]);
        initVOTYP2_I(s[329]);
        initVOTYP2_IFLAG(s[330]);
        initVOTYP3(s[331]);
        initVOTYP3_I(s[332]);
        initVOTYP3_IFLAG(s[333]);
        initVOTYP4(s[334]);
        initVOTYP4_I(s[335]);
        initVOTYP4_IFLAG(s[336]);
        initVOTYP5(s[337]);
        initVOTYP5_I(s[338]);
        initVOTYP5_IFLAG(s[339]);
        initVOVAL(s[340]);
        initVOVAL_I(s[341]);
        initVOVAL_IFLAG(s[342]);
        initVOVLB(s[343]);
        initVOVLB_I(s[344]);
        initVOVLB_IFLAG(s[345]);
        initVPERS2(s[346]);
        initVPERS3(s[347]);
        initVPERS4(s[348]);
        initVPERS5(s[349]);
        initVPERS6(s[350]);
        initVPERS6_I(s[351]);
        initVPERS6_IFLAG(s[352]);
        initVPERS(s[353]);
        initVPERV(s[354]);
        initVPERV_I(s[355]);
        initVPERV_IFLAG(s[356]);
        initVSHPCT2(s[357]);
        initVSHPCT3(s[358]);
        initVSHPCT4(s[359]);
        initVSHPCT5(s[360]);
        initVSHPCT(s[361]);
        initVTYPE2(s[362]);
        initVTYPE2_I(s[363]);
        initVTYPE2_IFLAG(s[364]);
        initVTYPE(s[365]);
        initVTYPE_I(s[366]);
        initVTYPE_IFLAG(s[367]);
        initALLENDW(s[368]);
        initALLGD(s[369]);
        initDVBLDDEBT(s[370]);
        initDVBLDVAL(s[371]);
        initDVCACRVAL_SUM(s[372]);
        initDVCACTV_SUM(s[373]);
        initDVCAODVAL_SUM(s[374]);
        initDVCASVV_SUM(s[375]);
        initDVCAVAL_SUM(s[376]);
        initDVCISAV_SUM(s[377]);
        initDVDBRWEALTHVAL_SUM(s[378]);
        initDVEQHIP(s[379]);
        initDVEQRELVAL(s[380]);
        initDVEQRUPM(s[381]);
        initDVFBONDV_SUM(s[382]);
        initDVFCOLLV_SUM(s[383]);
        initDVFESHARES_SUM(s[384]);
        initDVFFASSETS_SUM(s[385]);
        initDVFGLTFOV_SUM(s[386]);
        initDVFGLTUKV_SUM(s[387]);
        initDVFINFLV_SUM(s[388]);
        initDVFINFVAL_SUM(s[389]);
        initDVFINFV_SUM(s[390]);
        initDVFINVOTV_SUM(s[391]);
        initDVFNSVAL_SUM(s[392]);
        initDVFSHOSV_SUM(s[393]);
        initDVFSHUKV_SUM(s[394]);
        initDVGCOLLV(s[395]);
        initDVHORP(s[396]);
        initDVHSEDEBT(s[397]);
        initDVHSEVAL(s[398]);
        initDVHVALUE(s[399]);
        initDVIISAV_SUM(s[400]);
        initDVINSV_SUM(s[401]);
        initDVISAVAL_SUM(s[402]);
        initDVKISAV_SUM(s[403]);
        initDVLOSDEBT(s[404]);
        initDVLOSVAL(s[405]);
        initDVLUKDEBT(s[406]);
        initDVLUKVAL(s[407]);
        initDVOPRDEBT(s[408]);
        initDVOPRVAL(s[409]);
        initDVPAVCUV_SUM(s[410]);
        initDVPEPV_SUM(s[411]);
        initDVPFCURVAL_SUM(s[412]);
        initDVPFDDV_SUM(s[413]);
        initDVPINPVAL_SUM(s[414]);
        initDVPPVAL_SUM(s[415]);
        initDVPRIRNT(s[416]);
        initDVPROPERTY(s[417]);
        initDVSAVAL_SUM(s[418]);
        initDVSPEN_SUM(s[419]);
        initDVTOTCARVAL(s[420]);
        initDVTOTMOTBVAL(s[421]);
        initDVTOTOTHVEHVAL(s[422]);
        initDVTOTPERNPVAL(s[423]);
        initDVTOTVANVAL(s[424]);
        initDVTOTVEHVAL(s[425]);
        initDVVALDBT_SUM(s[426]);
        initDVVALDCOS_SUM(s[427]);
        initHFINL_SUM(s[428]);
        initHFINW_EXCENDW_SUM(s[429]);
        initHFINWNT_SUM(s[430]);
        initHFINW_SUM(s[431]);
        initHMORTG(s[432]);
        initHOUSGDST_SUM(s[433]);
        initHPARR_SUM(s[434]);
        initHPHYSW(s[435]);
        initHPROPW(s[436]);
        initLANDOVSEAT_SUM(s[437]);
        initLNARR_SUM(s[438]);
        initMOARR_SUM(s[439]);
        initT_FLNS_SUM(s[440]);
        initT_LNS_SUM(s[441]);
        initT_SLNS_SUM(s[442]);
        initTOTBILLARR_SUM(s[443]);
        initTOTCC_SUM(s[444]);
        initTOTHP_SUM(s[445]);
        initTOTLOS_SUM(s[446]);
        initTOTMNEG(s[447]);
        initTOTMORT(s[448]);
        initTOTMO_SUM(s[449]);
        initTOTMVAL(s[450]);
        initTOTPEN_SUM(s[451]);
        initTOTSC_SUM(s[452]);
        initTOTWLTH(s[453]);
        initDVHRPNUM(s[454]);
        initDVHSIZE(s[455]);
        initHHLDR(s[456]);
        initHHOLDTYPE(s[457]);
        initHRPDVAGE9(s[458]);
        initHRPDVILO3A(s[459]);
        initHRPDVMRDF(s[460]);
        initHRPEDATTN1(s[461]);
        initHRPEDATTN2(s[462]);
        initHRPEDATTN3(s[463]);
        initHRPEDLEVEL(s[464]);
        initHRPEMPSTAT2(s[465]);
        initHRPIOUT1(s[466]);
        initHRPNSSEC3(s[467]);
        initHRPPARTIOUT1(s[468]);
        initHRPPART(s[469]);
        initHRPSEX(s[470]);
        initNBABY(s[471]);
        initNC1015(s[472]);
        initNC1618(s[473]);
        initNC5TO9(s[474]);
        initNCHILD(s[475]);
        initNCU16(s[476]);
        initNCUND5(s[477]);
        initNDEPC(s[478]);
        initNNDEPC(s[479]);
        initNUMADULT(s[480]);
        initNUMCH18(s[481]);
        initNUMCHILD(s[482]);
        initNUMCPART(s[483]);
        initNUMDEPCH(s[484]);
        initNUMHHLDR(s[485]);
        initNUMJOB(s[486]);
        initNUMMPART(s[487]);
        initNUMSSEX(s[488]);
        initVESTV3_IFLAG(s[489]);
        initVESVB3(s[490]);
        initVESTV3(s[491]);
        initVESTV3_I(s[492]);
        initHRPDVAGE15(s[493]);
        initHBEDRM(s[494]);
        initCASEW1(s[495]);
        initHRPDVAGEW1BAND(s[496]);
        initGOR(s[497]);
        initYEAR(s[498]);
        initMONTH(s[499]);
    }

    @Override
    public WaAS_RecordID getID() {
        return (WaAS_RecordID) id;
    }
}

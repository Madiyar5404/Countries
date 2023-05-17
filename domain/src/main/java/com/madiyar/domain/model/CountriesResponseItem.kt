package com.madiyar.domain.model

import com.google.gson.annotations.SerializedName

data class CountriesResponseItem(
    @SerializedName("altSpellings")
    val altSpellings: List<String>,
    @SerializedName("area")
    val area: Double,
    @SerializedName("borders")
    val borders: List<String>,
    @SerializedName("capital")
    val capital: List<String>,
    @SerializedName("capitalInfo")
    val capitalInfo: CapitalInfo,
    @SerializedName("car")
    val car: Car,
    @SerializedName("cca2")
    val cca2: String,
    @SerializedName("cca3")
    val cca3: String,
    @SerializedName("ccn3")
    val ccn3: String,
    @SerializedName("cioc")
    val cioc: String,
    @SerializedName("coatOfArms")
    val coatOfArms: CoatOfArms,
    @SerializedName("continents")
    val continents: List<String>,
    @SerializedName("currencies")
    val currencies: Currencies,
    @SerializedName("demonyms")
    val demonyms: Demonyms,
    @SerializedName("fifa")
    val fifa: String,
    @SerializedName("flag")
    val flag: String,
    @SerializedName("flags")
    val flags: Flags,
    @SerializedName("gini")
    val gini: Gini,
    @SerializedName("idd")
    val idd: Idd,
    @SerializedName("independent")
    val independent: Boolean,
    @SerializedName("landlocked")
    val landlocked: Boolean,
    @SerializedName("languages")
    val languages: Languages,
    @SerializedName("latlng")
    val latlng: List<Double>,
    @SerializedName("maps")
    val maps: Maps,
    @SerializedName("name")
    val name: Name,
    @SerializedName("population")
    val population: Int,
    @SerializedName("postalCode")
    val postalCode: PostalCode,
    @SerializedName("region")
    val region: String,
    @SerializedName("startOfWeek")
    val startOfWeek: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("subregion")
    val subregion: String,
    @SerializedName("timezones")
    val timezones: List<String>,
    @SerializedName("tld")
    val tld: List<String>,
    @SerializedName("translations")
    val translations: Translations,
    @SerializedName("unMember")
    val unMember: Boolean
) {
    data class CapitalInfo(
        @SerializedName("latlng")
        val latlng: List<Double>
    )

    data class Car(
        @SerializedName("side")
        val side: String,
        @SerializedName("signs")
        val signs: List<String>
    )

    data class CoatOfArms(
        @SerializedName("png")
        val png: String,
        @SerializedName("svg")
        val svg: String
    )

    data class Currencies(
        @SerializedName("AED")
        val aED: AED,
        @SerializedName("AFN")
        val aFN: AFN,
        @SerializedName("ALL")
        val aLL: ALL,
        @SerializedName("AMD")
        val aMD: AMD,
        @SerializedName("ANG")
        val aNG: ANG,
        @SerializedName("AOA")
        val aOA: AOA,
        @SerializedName("ARS")
        val aRS: ARS,
        @SerializedName("AUD")
        val aUD: AUD,
        @SerializedName("AWG")
        val aWG: AWG,
        @SerializedName("AZN")
        val aZN: AZN,
        @SerializedName("BAM")
        val bAM: BAM,
        @SerializedName("BBD")
        val bBD: BBD,
        @SerializedName("BDT")
        val bDT: BDT,
        @SerializedName("BGN")
        val bGN: BGN,
        @SerializedName("BHD")
        val bHD: BHD,
        @SerializedName("BIF")
        val bIF: BIF,
        @SerializedName("BMD")
        val bMD: BMD,
        @SerializedName("BND")
        val bND: BND,
        @SerializedName("BOB")
        val bOB: BOB,
        @SerializedName("BRL")
        val bRL: BRL,
        @SerializedName("BSD")
        val bSD: BSD,
        @SerializedName("BTN")
        val bTN: BTN,
        @SerializedName("BWP")
        val bWP: BWP,
        @SerializedName("BYN")
        val bYN: BYN,
        @SerializedName("BZD")
        val bZD: BZD,
        @SerializedName("CAD")
        val cAD: CAD,
        @SerializedName("CDF")
        val cDF: CDF,
        @SerializedName("CHF")
        val cHF: CHF,
        @SerializedName("CKD")
        val cKD: CKD,
        @SerializedName("CLP")
        val cLP: CLP,
        @SerializedName("CNY")
        val cNY: CNY,
        @SerializedName("COP")
        val cOP: COP,
        @SerializedName("CRC")
        val cRC: CRC,
        @SerializedName("CUC")
        val cUC: CUC,
        @SerializedName("CUP")
        val cUP: CUP,
        @SerializedName("CVE")
        val cVE: CVE,
        @SerializedName("CZK")
        val cZK: CZK,
        @SerializedName("DJF")
        val dJF: DJF,
        @SerializedName("DKK")
        val dKK: DKK,
        @SerializedName("DOP")
        val dOP: DOP,
        @SerializedName("DZD")
        val dZD: DZD,
        @SerializedName("EGP")
        val eGP: EGP,
        @SerializedName("ERN")
        val eRN: ERN,
        @SerializedName("ETB")
        val eTB: ETB,
        @SerializedName("EUR")
        val eUR: EUR,
        @SerializedName("FJD")
        val fJD: FJD,
        @SerializedName("FKP")
        val fKP: FKP,
        @SerializedName("FOK")
        val fOK: FOK,
        @SerializedName("GBP")
        val gBP: GBP,
        @SerializedName("GEL")
        val gEL: GEL,
        @SerializedName("GGP")
        val gGP: GGP,
        @SerializedName("GHS")
        val gHS: GHS,
        @SerializedName("GIP")
        val gIP: GIP,
        @SerializedName("GMD")
        val gMD: GMD,
        @SerializedName("GNF")
        val gNF: GNF,
        @SerializedName("GTQ")
        val gTQ: GTQ,
        @SerializedName("GYD")
        val gYD: GYD,
        @SerializedName("HKD")
        val hKD: HKD,
        @SerializedName("HNL")
        val hNL: HNL,
        @SerializedName("HTG")
        val hTG: HTG,
        @SerializedName("HUF")
        val hUF: HUF,
        @SerializedName("IDR")
        val iDR: IDR,
        @SerializedName("ILS")
        val iLS: ILS,
        @SerializedName("IMP")
        val iMP: IMP,
        @SerializedName("INR")
        val iNR: INR,
        @SerializedName("IQD")
        val iQD: IQD,
        @SerializedName("IRR")
        val iRR: IRR,
        @SerializedName("ISK")
        val iSK: ISK,
        @SerializedName("JEP")
        val jEP: JEP,
        @SerializedName("JMD")
        val jMD: JMD,
        @SerializedName("JOD")
        val jOD: JOD,
        @SerializedName("JPY")
        val jPY: JPY,
        @SerializedName("KES")
        val kES: KES,
        @SerializedName("KGS")
        val kGS: KGS,
        @SerializedName("KHR")
        val kHR: KHR,
        @SerializedName("KID")
        val kID: KID,
        @SerializedName("KMF")
        val kMF: KMF,
        @SerializedName("KPW")
        val kPW: KPW,
        @SerializedName("KRW")
        val kRW: KRW,
        @SerializedName("KWD")
        val kWD: KWD,
        @SerializedName("KYD")
        val kYD: KYD,
        @SerializedName("KZT")
        val kZT: KZT,
        @SerializedName("LAK")
        val lAK: LAK,
        @SerializedName("LBP")
        val lBP: LBP,
        @SerializedName("LKR")
        val lKR: LKR,
        @SerializedName("LRD")
        val lRD: LRD,
        @SerializedName("LSL")
        val lSL: LSL,
        @SerializedName("LYD")
        val lYD: LYD,
        @SerializedName("MAD")
        val mAD: MAD,
        @SerializedName("MDL")
        val mDL: MDL,
        @SerializedName("MGA")
        val mGA: MGA,
        @SerializedName("MKD")
        val mKD: MKD,
        @SerializedName("MMK")
        val mMK: MMK,
        @SerializedName("MNT")
        val mNT: MNT,
        @SerializedName("MOP")
        val mOP: MOP,
        @SerializedName("MRU")
        val mRU: MRU,
        @SerializedName("MUR")
        val mUR: MUR,
        @SerializedName("MVR")
        val mVR: MVR,
        @SerializedName("MWK")
        val mWK: MWK,
        @SerializedName("MXN")
        val mXN: MXN,
        @SerializedName("MYR")
        val mYR: MYR,
        @SerializedName("MZN")
        val mZN: MZN,
        @SerializedName("NAD")
        val nAD: NAD,
        @SerializedName("NGN")
        val nGN: NGN,
        @SerializedName("NIO")
        val nIO: NIO,
        @SerializedName("NOK")
        val nOK: NOK,
        @SerializedName("NPR")
        val nPR: NPR,
        @SerializedName("NZD")
        val nZD: NZD,
        @SerializedName("OMR")
        val oMR: OMR,
        @SerializedName("PAB")
        val pAB: PAB,
        @SerializedName("PEN")
        val pEN: PEN,
        @SerializedName("PGK")
        val pGK: PGK,
        @SerializedName("PHP")
        val pHP: PHP,
        @SerializedName("PKR")
        val pKR: PKR,
        @SerializedName("PLN")
        val pLN: PLN,
        @SerializedName("PYG")
        val pYG: PYG,
        @SerializedName("QAR")
        val qAR: QAR,
        @SerializedName("RON")
        val rON: RON,
        @SerializedName("RSD")
        val rSD: RSD,
        @SerializedName("RUB")
        val rUB: RUB,
        @SerializedName("RWF")
        val rWF: RWF,
        @SerializedName("SAR")
        val sAR: SAR,
        @SerializedName("SBD")
        val sBD: SBD,
        @SerializedName("SCR")
        val sCR: SCR,
        @SerializedName("SDG")
        val sDG: SDG,
        @SerializedName("SEK")
        val sEK: SEK,
        @SerializedName("SGD")
        val sGD: SGD,
        @SerializedName("SHP")
        val sHP: SHP,
        @SerializedName("SLL")
        val sLL: SLL,
        @SerializedName("SOS")
        val sOS: SOS,
        @SerializedName("SRD")
        val sRD: SRD,
        @SerializedName("SSP")
        val sSP: SSP,
        @SerializedName("STN")
        val sTN: STN,
        @SerializedName("SYP")
        val sYP: SYP,
        @SerializedName("SZL")
        val sZL: SZL,
        @SerializedName("THB")
        val tHB: THB,
        @SerializedName("TJS")
        val tJS: TJS,
        @SerializedName("TMT")
        val tMT: TMT,
        @SerializedName("TND")
        val tND: TND,
        @SerializedName("TOP")
        val tOP: TOP,
        @SerializedName("TRY")
        val tRY: TRY,
        @SerializedName("TTD")
        val tTD: TTD,
        @SerializedName("TVD")
        val tVD: TVD,
        @SerializedName("TWD")
        val tWD: TWD,
        @SerializedName("TZS")
        val tZS: TZS,
        @SerializedName("UAH")
        val uAH: UAH,
        @SerializedName("UGX")
        val uGX: UGX,
        @SerializedName("USD")
        val uSD: USD,
        @SerializedName("UYU")
        val uYU: UYU,
        @SerializedName("UZS")
        val uZS: UZS,
        @SerializedName("VES")
        val vES: VES,
        @SerializedName("VND")
        val vND: VND,
        @SerializedName("VUV")
        val vUV: VUV,
        @SerializedName("WST")
        val wST: WST,
        @SerializedName("XAF")
        val xAF: XAF,
        @SerializedName("XCD")
        val xCD: XCD,
        @SerializedName("XOF")
        val xOF: XOF,
        @SerializedName("XPF")
        val xPF: XPF,
        @SerializedName("YER")
        val yER: YER,
        @SerializedName("ZAR")
        val zAR: ZAR,
        @SerializedName("ZMW")
        val zMW: ZMW,
        @SerializedName("ZWL")
        val zWL: ZWL
    ) {


        data class AED(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class AFN(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class ALL(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class AMD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class ANG(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class AOA(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class ARS(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class AUD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class AWG(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class AZN(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BAM(
            @SerializedName("name")
            val name: String
        )

        data class BBD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BDT(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BGN(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BHD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BIF(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BMD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BND(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BOB(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BRL(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BSD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BTN(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BWP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BYN(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class BZD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class CAD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class CDF(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class CHF(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class CKD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class CLP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class CNY(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class COP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class CRC(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class CUC(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class CUP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class CVE(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class CZK(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class DJF(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class DKK(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class DOP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class DZD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class EGP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class ERN(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class ETB(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class EUR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class FJD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class FKP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class FOK(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class GBP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class GEL(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class GGP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class GHS(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class GIP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class GMD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class GNF(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class GTQ(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class GYD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class HKD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class HNL(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class HTG(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class HUF(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class IDR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class ILS(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class IMP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class INR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class IQD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class IRR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class ISK(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class JEP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class JMD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class JOD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class JPY(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class KES(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class KGS(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class KHR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class KID(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class KMF(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class KPW(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class KRW(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class KWD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class KYD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class KZT(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class LAK(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class LBP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class LKR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class LRD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class LSL(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class LYD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MAD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MDL(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MGA(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MKD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MMK(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MNT(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MOP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MRU(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MUR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MVR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MWK(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MXN(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MYR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class MZN(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class NAD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class NGN(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class NIO(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class NOK(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class NPR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class NZD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class OMR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class PAB(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class PEN(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class PGK(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class PHP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class PKR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class PLN(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class PYG(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class QAR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class RON(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class RSD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class RUB(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class RWF(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class SAR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class SBD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class SCR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class SDG(
            @SerializedName("name")
            val name: String
        )

        data class SEK(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class SGD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class SHP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class SLL(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class SOS(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class SRD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class SSP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class STN(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class SYP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class SZL(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class THB(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class TJS(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class TMT(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class TND(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class TOP(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class TRY(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class TTD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class TVD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class TWD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class TZS(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class UAH(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class UGX(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class USD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class UYU(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class UZS(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class VES(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class VND(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class VUV(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class WST(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class XAF(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class XCD(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class XOF(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class XPF(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class YER(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class ZAR(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class ZMW(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )

        data class ZWL(
            @SerializedName("name")
            val name: String,
            @SerializedName("symbol")
            val symbol: String
        )
    }

    data class Demonyms(
        @SerializedName("eng")
        val eng: Eng,
        @SerializedName("fra")
        val fra: Fra
    ) {
        data class Eng(
            @SerializedName("f")
            val f: String,
            @SerializedName("m")
            val m: String
        )

        data class Fra(
            @SerializedName("f")
            val f: String,
            @SerializedName("m")
            val m: String
        )
    }

    data class Flags(
        @SerializedName("alt")
        val alt: String,
        @SerializedName("png")
        val png: String,
        @SerializedName("svg")
        val svg: String
    )

    data class Gini(
        @SerializedName("1992")
        val x1992: Double,
        @SerializedName("1998")
        val x1998: Double,
        @SerializedName("1999")
        val x1999: Double,
        @SerializedName("2003")
        val x2003: Double,
        @SerializedName("2004")
        val x2004: Double,
        @SerializedName("2005")
        val x2005: Double,
        @SerializedName("2006")
        val x2006: Double,
        @SerializedName("2008")
        val x2008: Double,
        @SerializedName("2009")
        val x2009: Double,
        @SerializedName("2010")
        val x2010: Double,
        @SerializedName("2011")
        val x2011: Double,
        @SerializedName("2012")
        val x2012: Double,
        @SerializedName("2013")
        val x2013: Double,
        @SerializedName("2014")
        val x2014: Double,
        @SerializedName("2015")
        val x2015: Double,
        @SerializedName("2016")
        val x2016: Double,
        @SerializedName("2017")
        val x2017: Double,
        @SerializedName("2018")
        val x2018: Double,
        @SerializedName("2019")
        val x2019: Double
    )

    data class Idd(
        @SerializedName("root")
        val root: String,
        @SerializedName("suffixes")
        val suffixes: List<String>
    )

    data class Languages(
        @SerializedName("afr")
        val afr: String,
        @SerializedName("amh")
        val amh: String,
        @SerializedName("ara")
        val ara: String,
        @SerializedName("arc")
        val arc: String,
        @SerializedName("aym")
        val aym: String,
        @SerializedName("aze")
        val aze: String,
        @SerializedName("bel")
        val bel: String,
        @SerializedName("ben")
        val ben: String,
        @SerializedName("ber")
        val ber: String,
        @SerializedName("bis")
        val bis: String,
        @SerializedName("bjz")
        val bjz: String,
        @SerializedName("bos")
        val bos: String,
        @SerializedName("bul")
        val bul: String,
        @SerializedName("bwg")
        val bwg: String,
        @SerializedName("cal")
        val cal: String,
        @SerializedName("cat")
        val cat: String,
        @SerializedName("ces")
        val ces: String,
        @SerializedName("cha")
        val cha: String,
        @SerializedName("ckb")
        val ckb: String,
        @SerializedName("cnr")
        val cnr: String,
        @SerializedName("crs")
        val crs: String,
        @SerializedName("dan")
        val dan: String,
        @SerializedName("de")
        val de: String,
        @SerializedName("deu")
        val deu: String,
        @SerializedName("div")
        val div: String,
        @SerializedName("dzo")
        val dzo: String,
        @SerializedName("ell")
        val ell: String,
        @SerializedName("eng")
        val eng: String,
        @SerializedName("est")
        val est: String,
        @SerializedName("fao")
        val fao: String,
        @SerializedName("fas")
        val fas: String,
        @SerializedName("fij")
        val fij: String,
        @SerializedName("fil")
        val fil: String,
        @SerializedName("fin")
        val fin: String,
        @SerializedName("fra")
        val fra: String,
        @SerializedName("gil")
        val gil: String,
        @SerializedName("gle")
        val gle: String,
        @SerializedName("glv")
        val glv: String,
        @SerializedName("grn")
        val grn: String,
        @SerializedName("gsw")
        val gsw: String,
        @SerializedName("hat")
        val hat: String,
        @SerializedName("heb")
        val heb: String,
        @SerializedName("her")
        val her: String,
        @SerializedName("hgm")
        val hgm: String,
        @SerializedName("hif")
        val hif: String,
        @SerializedName("hin")
        val hin: String,
        @SerializedName("hmo")
        val hmo: String,
        @SerializedName("hrv")
        val hrv: String,
        @SerializedName("hun")
        val hun: String,
        @SerializedName("hye")
        val hye: String,
        @SerializedName("ind")
        val ind: String,
        @SerializedName("isl")
        val isl: String,
        @SerializedName("ita")
        val ita: String,
        @SerializedName("jam")
        val jam: String,
        @SerializedName("jpn")
        val jpn: String,
        @SerializedName("kal")
        val kal: String,
        @SerializedName("kat")
        val kat: String,
        @SerializedName("kaz")
        val kaz: String,
        @SerializedName("kck")
        val kck: String,
        @SerializedName("khi")
        val khi: String,
        @SerializedName("khm")
        val khm: String,
        @SerializedName("kin")
        val kin: String,
        @SerializedName("kir")
        val kir: String,
        @SerializedName("kon")
        val kon: String,
        @SerializedName("kor")
        val kor: String,
        @SerializedName("kwn")
        val kwn: String,
        @SerializedName("lao")
        val lao: String,
        @SerializedName("lat")
        val lat: String,
        @SerializedName("lav")
        val lav: String,
        @SerializedName("lin")
        val lin: String,
        @SerializedName("lit")
        val lit: String,
        @SerializedName("loz")
        val loz: String,
        @SerializedName("ltz")
        val ltz: String,
        @SerializedName("lua")
        val lua: String,
        @SerializedName("mah")
        val mah: String,
        @SerializedName("mey")
        val mey: String,
        @SerializedName("mfe")
        val mfe: String,
        @SerializedName("mkd")
        val mkd: String,
        @SerializedName("mlg")
        val mlg: String,
        @SerializedName("mlt")
        val mlt: String,
        @SerializedName("mon")
        val mon: String,
        @SerializedName("mri")
        val mri: String,
        @SerializedName("msa")
        val msa: String,
        @SerializedName("mya")
        val mya: String,
        @SerializedName("nau")
        val nau: String,
        @SerializedName("nbl")
        val nbl: String,
        @SerializedName("ndc")
        val ndc: String,
        @SerializedName("nde")
        val nde: String,
        @SerializedName("ndo")
        val ndo: String,
        @SerializedName("nep")
        val nep: String,
        @SerializedName("nfr")
        val nfr: String,
        @SerializedName("niu")
        val niu: String,
        @SerializedName("nld")
        val nld: String,
        @SerializedName("nno")
        val nno: String,
        @SerializedName("nob")
        val nob: String,
        @SerializedName("nor")
        val nor: String,
        @SerializedName("nrf")
        val nrf: String,
        @SerializedName("nso")
        val nso: String,
        @SerializedName("nya")
        val nya: String,
        @SerializedName("nzs")
        val nzs: String,
        @SerializedName("pap")
        val pap: String,
        @SerializedName("pau")
        val pau: String,
        @SerializedName("pih")
        val pih: String,
        @SerializedName("pol")
        val pol: String,
        @SerializedName("por")
        val por: String,
        @SerializedName("pov")
        val pov: String,
        @SerializedName("prs")
        val prs: String,
        @SerializedName("pus")
        val pus: String,
        @SerializedName("que")
        val que: String,
        @SerializedName("rar")
        val rar: String,
        @SerializedName("roh")
        val roh: String,
        @SerializedName("ron")
        val ron: String,
        @SerializedName("run")
        val run: String,
        @SerializedName("rus")
        val rus: String,
        @SerializedName("sag")
        val sag: String,
        @SerializedName("sin")
        val sin: String,
        @SerializedName("slk")
        val slk: String,
        @SerializedName("slv")
        val slv: String,
        @SerializedName("smi")
        val smi: String,
        @SerializedName("smo")
        val smo: String,
        @SerializedName("sna")
        val sna: String,
        @SerializedName("som")
        val som: String,
        @SerializedName("sot")
        val sot: String,
        @SerializedName("spa")
        val spa: String,
        @SerializedName("sqi")
        val sqi: String,
        @SerializedName("srp")
        val srp: String,
        @SerializedName("ssw")
        val ssw: String,
        @SerializedName("swa")
        val swa: String,
        @SerializedName("swe")
        val swe: String,
        @SerializedName("tam")
        val tam: String,
        @SerializedName("tet")
        val tet: String,
        @SerializedName("tgk")
        val tgk: String,
        @SerializedName("tha")
        val tha: String,
        @SerializedName("tir")
        val tir: String,
        @SerializedName("tkl")
        val tkl: String,
        @SerializedName("toi")
        val toi: String,
        @SerializedName("ton")
        val ton: String,
        @SerializedName("tpi")
        val tpi: String,
        @SerializedName("tsn")
        val tsn: String,
        @SerializedName("tso")
        val tso: String,
        @SerializedName("tuk")
        val tuk: String,
        @SerializedName("tur")
        val tur: String,
        @SerializedName("tvl")
        val tvl: String,
        @SerializedName("ukr")
        val ukr: String,
        @SerializedName("urd")
        val urd: String,
        @SerializedName("uzb")
        val uzb: String,
        @SerializedName("ven")
        val ven: String,
        @SerializedName("vie")
        val vie: String,
        @SerializedName("xho")
        val xho: String,
        @SerializedName("zdj")
        val zdj: String,
        @SerializedName("zho")
        val zho: String,
        @SerializedName("zib")
        val zib: String,
        @SerializedName("zul")
        val zul: String
    )

    data class Maps(
        @SerializedName("googleMaps")
        val googleMaps: String,
        @SerializedName("openStreetMaps")
        val openStreetMaps: String
    )

    data class Name(
        @SerializedName("common")
        val common: String,
        @SerializedName("nativeName")
        val nativeName: NativeName,
        @SerializedName("official")
        val official: String
    ) {
        data class NativeName(
            @SerializedName("afr")
            val afr: Afr,
            @SerializedName("amh")
            val amh: Amh,
            @SerializedName("ara")
            val ara: Ara,
            @SerializedName("arc")
            val arc: Arc,
            @SerializedName("aym")
            val aym: Aym,
            @SerializedName("aze")
            val aze: Aze,
            @SerializedName("bar")
            val bar: Bar,
            @SerializedName("bel")
            val bel: Bel,
            @SerializedName("ben")
            val ben: Ben,
            @SerializedName("ber")
            val ber: Ber,
            @SerializedName("bis")
            val bis: Bis,
            @SerializedName("bjz")
            val bjz: Bjz,
            @SerializedName("bos")
            val bos: Bos,
            @SerializedName("bul")
            val bul: Bul,
            @SerializedName("bwg")
            val bwg: Bwg,
            @SerializedName("cal")
            val cal: Cal,
            @SerializedName("cat")
            val cat: Cat,
            @SerializedName("ces")
            val ces: Ces,
            @SerializedName("cha")
            val cha: Cha,
            @SerializedName("ckb")
            val ckb: Ckb,
            @SerializedName("cnr")
            val cnr: Cnr,
            @SerializedName("crs")
            val crs: Crs,
            @SerializedName("dan")
            val dan: Dan,
            @SerializedName("deu")
            val deu: Deu,
            @SerializedName("div")
            val div: Div,
            @SerializedName("dzo")
            val dzo: Dzo,
            @SerializedName("ell")
            val ell: Ell,
            @SerializedName("eng")
            val eng: Eng,
            @SerializedName("est")
            val est: Est,
            @SerializedName("fao")
            val fao: Fao,
            @SerializedName("fas")
            val fas: Fas,
            @SerializedName("fij")
            val fij: Fij,
            @SerializedName("fil")
            val fil: Fil,
            @SerializedName("fin")
            val fin: Fin,
            @SerializedName("fra")
            val fra: Fra,
            @SerializedName("gil")
            val gil: Gil,
            @SerializedName("gle")
            val gle: Gle,
            @SerializedName("glv")
            val glv: Glv,
            @SerializedName("grn")
            val grn: Grn,
            @SerializedName("gsw")
            val gsw: Gsw,
            @SerializedName("hat")
            val hat: Hat,
            @SerializedName("heb")
            val heb: Heb,
            @SerializedName("her")
            val her: Her,
            @SerializedName("hgm")
            val hgm: Hgm,
            @SerializedName("hif")
            val hif: Hif,
            @SerializedName("hin")
            val hin: Hin,
            @SerializedName("hmo")
            val hmo: Hmo,
            @SerializedName("hrv")
            val hrv: Hrv,
            @SerializedName("hun")
            val hun: Hun,
            @SerializedName("hye")
            val hye: Hye,
            @SerializedName("ind")
            val ind: Ind,
            @SerializedName("isl")
            val isl: Isl,
            @SerializedName("ita")
            val ita: Ita,
            @SerializedName("jam")
            val jam: Jam,
            @SerializedName("jpn")
            val jpn: Jpn,
            @SerializedName("kal")
            val kal: Kal,
            @SerializedName("kat")
            val kat: Kat,
            @SerializedName("kaz")
            val kaz: Kaz,
            @SerializedName("kck")
            val kck: Kck,
            @SerializedName("khi")
            val khi: Khi,
            @SerializedName("khm")
            val khm: Khm,
            @SerializedName("kin")
            val kin: Kin,
            @SerializedName("kir")
            val kir: Kir,
            @SerializedName("kon")
            val kon: Kon,
            @SerializedName("kor")
            val kor: Kor,
            @SerializedName("kwn")
            val kwn: Kwn,
            @SerializedName("lao")
            val lao: Lao,
            @SerializedName("lat")
            val lat: Lat,
            @SerializedName("lav")
            val lav: Lav,
            @SerializedName("lin")
            val lin: Lin,
            @SerializedName("lit")
            val lit: Lit,
            @SerializedName("loz")
            val loz: Loz,
            @SerializedName("ltz")
            val ltz: Ltz,
            @SerializedName("lua")
            val lua: Lua,
            @SerializedName("mah")
            val mah: Mah,
            @SerializedName("mey")
            val mey: Mey,
            @SerializedName("mfe")
            val mfe: Mfe,
            @SerializedName("mkd")
            val mkd: Mkd,
            @SerializedName("mlg")
            val mlg: Mlg,
            @SerializedName("mlt")
            val mlt: Mlt,
            @SerializedName("mon")
            val mon: Mon,
            @SerializedName("mri")
            val mri: Mri,
            @SerializedName("msa")
            val msa: Msa,
            @SerializedName("mya")
            val mya: Mya,
            @SerializedName("nau")
            val nau: Nau,
            @SerializedName("nbl")
            val nbl: Nbl,
            @SerializedName("ndc")
            val ndc: Ndc,
            @SerializedName("nde")
            val nde: Nde,
            @SerializedName("ndo")
            val ndo: Ndo,
            @SerializedName("nep")
            val nep: Nep,
            @SerializedName("nfr")
            val nfr: Nfr,
            @SerializedName("niu")
            val niu: Niu,
            @SerializedName("nld")
            val nld: Nld,
            @SerializedName("nno")
            val nno: Nno,
            @SerializedName("nob")
            val nob: Nob,
            @SerializedName("nor")
            val nor: Nor,
            @SerializedName("nrf")
            val nrf: Nrf,
            @SerializedName("nso")
            val nso: Nso,
            @SerializedName("nya")
            val nya: Nya,
            @SerializedName("nzs")
            val nzs: Nzs,
            @SerializedName("pap")
            val pap: Pap,
            @SerializedName("pau")
            val pau: Pau,
            @SerializedName("pih")
            val pih: Pih,
            @SerializedName("pol")
            val pol: Pol,
            @SerializedName("por")
            val por: Por,
            @SerializedName("pov")
            val pov: Pov,
            @SerializedName("prs")
            val prs: Prs,
            @SerializedName("pus")
            val pus: Pus,
            @SerializedName("que")
            val que: Que,
            @SerializedName("rar")
            val rar: Rar,
            @SerializedName("roh")
            val roh: Roh,
            @SerializedName("ron")
            val ron: Ron,
            @SerializedName("run")
            val run: Run,
            @SerializedName("rus")
            val rus: Rus,
            @SerializedName("sag")
            val sag: Sag,
            @SerializedName("sin")
            val sin: Sin,
            @SerializedName("slk")
            val slk: Slk,
            @SerializedName("slv")
            val slv: Slv,
            @SerializedName("smi")
            val smi: Smi,
            @SerializedName("smo")
            val smo: Smo,
            @SerializedName("sna")
            val sna: Sna,
            @SerializedName("som")
            val som: Som,
            @SerializedName("sot")
            val sot: Sot,
            @SerializedName("spa")
            val spa: Spa,
            @SerializedName("sqi")
            val sqi: Sqi,
            @SerializedName("srp")
            val srp: Srp,
            @SerializedName("ssw")
            val ssw: Ssw,
            @SerializedName("swa")
            val swa: Swa,
            @SerializedName("swe")
            val swe: Swe,
            @SerializedName("tam")
            val tam: Tam,
            @SerializedName("tet")
            val tet: Tet,
            @SerializedName("tgk")
            val tgk: Tgk,
            @SerializedName("tha")
            val tha: Tha,
            @SerializedName("tir")
            val tir: Tir,
            @SerializedName("tkl")
            val tkl: Tkl,
            @SerializedName("toi")
            val toi: Toi,
            @SerializedName("ton")
            val ton: Ton,
            @SerializedName("tpi")
            val tpi: Tpi,
            @SerializedName("tsn")
            val tsn: Tsn,
            @SerializedName("tso")
            val tso: Tso,
            @SerializedName("tuk")
            val tuk: Tuk,
            @SerializedName("tur")
            val tur: Tur,
            @SerializedName("tvl")
            val tvl: Tvl,
            @SerializedName("ukr")
            val ukr: Ukr,
            @SerializedName("urd")
            val urd: Urd,
            @SerializedName("uzb")
            val uzb: Uzb,
            @SerializedName("ven")
            val ven: Ven,
            @SerializedName("vie")
            val vie: Vie,
            @SerializedName("xho")
            val xho: Xho,
            @SerializedName("zdj")
            val zdj: Zdj,
            @SerializedName("zho")
            val zho: Zho,
            @SerializedName("zib")
            val zib: Zib,
            @SerializedName("zul")
            val zul: Zul
        ) {
            data class Afr(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Amh(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ara(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Arc(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Aym(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Aze(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Bar(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Bel(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ben(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ber(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Bis(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Bjz(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Bos(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Bul(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Bwg(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Cal(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Cat(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ces(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Cha(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ckb(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Cnr(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Crs(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Dan(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Deu(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Div(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Dzo(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ell(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Eng(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Est(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Fao(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Fas(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Fij(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Fil(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Fin(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Fra(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Gil(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Gle(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Glv(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Grn(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Gsw(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Hat(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Heb(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Her(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Hgm(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Hif(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Hin(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Hmo(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Hrv(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Hun(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Hye(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ind(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Isl(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ita(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Jam(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Jpn(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Kal(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Kat(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Kaz(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Kck(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Khi(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Khm(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Kin(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Kir(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Kon(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Kor(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Kwn(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Lao(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Lat(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Lav(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Lin(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Lit(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Loz(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ltz(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Lua(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Mah(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Mey(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Mfe(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Mkd(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Mlg(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Mlt(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Mon(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Mri(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Msa(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Mya(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Nau(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Nbl(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ndc(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Nde(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ndo(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Nep(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Nfr(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Niu(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Nld(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Nno(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Nob(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Nor(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Nrf(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Nso(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Nya(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Nzs(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Pap(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Pau(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Pih(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Pol(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Por(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Pov(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Prs(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Pus(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Que(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Rar(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Roh(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ron(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Run(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Rus(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Sag(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Sin(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Slk(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Slv(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Smi(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Smo(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Sna(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Som(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Sot(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Spa(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Sqi(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Srp(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ssw(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Swa(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Swe(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Tam(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Tet(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Tgk(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Tha(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Tir(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Tkl(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Toi(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ton(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Tpi(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Tsn(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Tso(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Tuk(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Tur(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Tvl(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ukr(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Urd(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Uzb(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Ven(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Vie(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Xho(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Zdj(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Zho(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Zib(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )

            data class Zul(
                @SerializedName("common")
                val common: String,
                @SerializedName("official")
                val official: String
            )
        }
    }

    data class PostalCode(
        @SerializedName("format")
        val format: String,
        @SerializedName("regex")
        val regex: String
    )

    data class Translations(
        @SerializedName("ara")
        val ara: Ara,
        @SerializedName("bre")
        val bre: Bre,
        @SerializedName("ces")
        val ces: Ces,
        @SerializedName("cym")
        val cym: Cym,
        @SerializedName("deu")
        val deu: Deu,
        @SerializedName("est")
        val est: Est,
        @SerializedName("fin")
        val fin: Fin,
        @SerializedName("fra")
        val fra: Fra,
        @SerializedName("hrv")
        val hrv: Hrv,
        @SerializedName("hun")
        val hun: Hun,
        @SerializedName("ita")
        val ita: Ita,
        @SerializedName("jpn")
        val jpn: Jpn,
        @SerializedName("kor")
        val kor: Kor,
        @SerializedName("nld")
        val nld: Nld,
        @SerializedName("per")
        val per: Per,
        @SerializedName("pol")
        val pol: Pol,
        @SerializedName("por")
        val por: Por,
        @SerializedName("rus")
        val rus: Rus,
        @SerializedName("slk")
        val slk: Slk,
        @SerializedName("spa")
        val spa: Spa,
        @SerializedName("srp")
        val srp: Srp,
        @SerializedName("swe")
        val swe: Swe,
        @SerializedName("tur")
        val tur: Tur,
        @SerializedName("urd")
        val urd: Urd,
        @SerializedName("zho")
        val zho: Zho
    ) {
        data class Ara(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Bre(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Ces(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Cym(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Deu(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Est(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Fin(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Fra(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Hrv(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Hun(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Ita(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Jpn(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Kor(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Nld(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Per(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Pol(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Por(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Rus(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Slk(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Spa(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Srp(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Swe(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Tur(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Urd(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )

        data class Zho(
            @SerializedName("common")
            val common: String,
            @SerializedName("official")
            val official: String
        )
    }
}

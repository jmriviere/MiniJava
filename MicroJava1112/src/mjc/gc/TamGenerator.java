package mjc.gc;

public class TamGenerator implements IGenerator {

	private static int cptr = 0;
	
	public String generateEtiquette() {
		return "x" + cptr++ + "\n\t";
	}
	
	@Override
	public String generateBloc(String att_code) {
		// TODO Auto-generated method stub
		return "";
	}
	public String generateVtable(Clazz construct){
		
		return"";
	}

	@Override
	public String generateConstructor(Clazz construct, String etiquette){
		return ";Constructor for " + construct.getName() + " class\n" + etiquette +"\n";
	}

	@Override
	public String generateAffectation(String variable, String code, int dep) {
		if (code.equals("")) {
			return "; Variable :" + variable + " sans init \n\t" + "PUSH " + dep + "\n";
		}
		else {
			return "; Variable: " + variable + "avec init \n" + code;
		}
	}

	@Override
	public String generateRelativeOperation(String att_lcode, String att_code,
			String att_code2) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateAdditionOperation(String att_lcode, String att_code,
			String att_code2) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateUnaryOperation(String att_code, String att_code2) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateBoolean(boolean b) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateCst(String val) {
		return "\tLOADL " + val + "\n";
	}

	@Override
	public String generateNull() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateInstance(Clazz glob_72_clazz, Signature att_signature) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateReturn(String att_code) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateIfThenElse(String att_code, String att_code2,
			String att_code3) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateSequence(String att_code, String att_code2) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateMinus() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateOr() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generatePlus() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateAnd() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateMult() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateMod() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateDiv() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateNEq() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateEq() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateInfEq() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateSupEq() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateInf() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateSup() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateNot() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateMultiplicationOperation(String att_lcode,
			String att_code, String att_code2) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateGetAttribute(String attr_name, Clazz clazz) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateGetVariable(String name) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateMethodCall(MethodList m_list, String m_name) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateQualification(String toto, String tata) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateHeader() {
		return "CALL main \nHALT\n";
	}

	@Override
	public String generateMethod(Clazz clazz, String etiquette, String name) {
		return ";Method " + name +" from class " + clazz.getName() + "\n" + etiquette + "\n";
	}

}

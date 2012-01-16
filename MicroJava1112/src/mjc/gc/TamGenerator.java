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

	@Override
	public Object generateConstructor(String att_code) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String generateAffectation(String att_code, String att_code2) {
		// TODO Auto-generated method stub
		return "";
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
	public String generateInteger(String att_txt) {
		// TODO Auto-generated method stub
		return "";
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
		return "\tCALL main \n\tHALT\n";
	}

	@Override
	public String generateMethod(String etiquette, String code) {
		return etiquette + "\n\t" + code;
	}

}

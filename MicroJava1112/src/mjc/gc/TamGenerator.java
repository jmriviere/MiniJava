package mjc.gc;

public class TamGenerator implements IGenerator {

	private static int cptr = 0;
	
	// Ce compteur indique le nombre de méthodes main définies et doit être <= 1
	public static int cptr_main = 0;
	
	@Override
	public String generateEtiquette() {
		return "x" + cptr++ + "\n\t";
	}
	
	@Override
	public String generateWriteHeap(INFO i) {
		return generateReadStack(i) + "\tSTOREI (" + i.getType().getTaille() + ")\n";
	}
	
	@Override
	public String generateBloc(String att_code) {
		// TODO Auto-generated method stub
		return "";
	}
	
	public String generateVtable(Clazz construct){
		
		return "";
	}

	@Override
	public String generateConstructor(Clazz construct, String etiquette){
		return ";Constructor for " + construct.getName() + " class\n" + etiquette +"\n";
	}

	@Override
	public String generateAffectation(String variable, String code, int dep) {
		if (code.equals("")) {
			return "; Variable :" + variable + " sans init, taille = " + dep + "\n\t" + "PUSH " + dep + "\n";
		}
		else {
			return "; Variable: " + variable + " avec init, taille = " + dep + "\n" + code;
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
	public String generateBoolean(int b) {
			return "\tLOADL " + b + "\n\tSUBR I2B" +"\n";
	}

	@Override
	public String generateCst(String val) {
		return "\tLOADL " + val + "\n";
	}

	@Override
	public String generateNull() {
		return "\tLOADL -1\n\tLOADL -1\n";
	}

	@Override
	public String generateInstance(Clazz clazz) {
		return "\tLOADL " + clazz.getTaille() + "\n\tSUBR Malloc\n\tPUSH 1\n";
	}
	
	@Override
	public String generateCallConstructor(Clazz clazz, Signature signature) {
		String etiq = clazz.getEtiquetteCons(signature);
		return "\tCALL (LB) " + etiq + "\n";
	}

	@Override
	public String generateIfThenElse(String codeCond, String codeTrue, String codeFalse) {
		int nbIfThenElse = cptr++;
		return "; Début if n° " + nbIfThenElse + "\n" + codeCond + "\tJUMPIF(0) else" + nbIfThenElse + "\n" + codeTrue + "\tJUMP finsi" + nbIfThenElse + "\nelse" + nbIfThenElse + "\n" + codeFalse + "finsi" + nbIfThenElse + "\n" ;
	}

	@Override
	public String generateMinus() {
		return "\tSUBR ISub\n";
	}

	@Override
	public String generateOr() {
		return "\tSUBR BOr\n";
	}

	@Override
	public String generatePlus() {
		return "\tSUBR IAdd\n";
	}

	@Override
	public String generateAnd() {
		return "\tSUBR BAnd\n";
	}

	@Override
	public String generateMult() {
		return "\tSUBR IMul\n";
	}

	@Override
	public String generateMod() {
		return "\tSUBR IMod\n";
	}

	@Override
	public String generateDiv() {
		return "\tSUBR IDiv\n";
	}

	@Override
	public String generateNEq() {
		return "\tSUBR INeq\n";
	}

	@Override
	public String generateEq() {
		return "\tSUBR Ieq\n";
	}

	@Override
	public String generateInfEq() {
		return "\tSUBR ILeq\n";
	}

	@Override
	public String generateSupEq() {
		return "\tSUBR IGeq\n";
	}

	@Override
	public String generateInf() {
		// TODO Auto-generated method stub
		return "\tSUBR ILss\n";
	}

	@Override
	public String generateSup() {
		return "\tSUBR IGss\n";
	}

	@Override
	public String generateNot() {
		return "\tSUBR BNeg\n";
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
	public String generateMethodCall(String m_etiq) {
		return "\tCALL (LB) " + m_etiq + "\n";
	}

	@Override
	public String generateQualification(String toto, String tata) {
		return "";
	}

	@Override
	public String generateHeader() {
		return "CALL (LB) main \nHALT\n\n";
	}

	@Override
	public String generateMethod(Clazz clazz, String etiquette, String name) {
		return ";Method " + name +" from class " + clazz.getName() + "\n" + etiquette + "\n";
	}

	@Override
	public String generateWriteStack(INFO i) {
		return "\tSTORE (" + i.getType().getTaille() + ") " + (i.getDep() - i.getType().getTaille()) + "[LB]\n";
	}
	
	@Override
	public String generateReadStack(INFO i) {
		return "\tLOAD (" + i.getType().getTaille() + ") " + (i.getDep() - i.getType().getTaille()) + "[LB]\n";
	}
	
	@Override
	public String generateMain() {
		if (cptr_main++ <= 1) {
			return "main\n";
		}
		else {
			return "";
		}
	}
	
	@Override
	public String generateReturn(int nb_args, int nb_mots_retour) {
		return "\tRETURN (" + nb_args + ") " + nb_mots_retour + "\n";
	}
	
	@Override
	public boolean canCreateMain() {
		return cptr_main < 1;
	}

}

package mjc.gc;

public interface IGenerator {

	String generateVtable(Clazz clazz);
	
	String generateEtiquette();
	
	String generateHeader();
	
	String generateBloc(String att_code);

	String generateConstructor(Clazz construct, String etiquette);

	String generateAffectation(String variable, String code, int dep);

	String generateRelativeOperation(String att_lcode, String att_code,
			String att_code2);

	String generateAdditionOperation(String att_lcode, String att_code,
			String att_code2);

	String generateUnaryOperation(String att_code, String att_code2);

	String generateBoolean(int b);

	String generateCst(String variable);

	String generateNull();

	String generateInstance(Clazz glob_72_clazz, Signature att_signature);

	String generateIfThenElse(String att_code, String att_code2,
			String att_code3);

	String generateMinus();

	String generateOr();

	String generatePlus();

	String generateAnd();

	String generateMult();

	String generateMod();

	String generateDiv();

	String generateNEq();

	String generateEq();

	String generateInfEq();

	String generateSupEq();

	String generateInf();

	String generateSup();
	
	String generateNot();

	String generateMultiplicationOperation(String att_lcode, String att_code,
			String att_code2);

	String generateGetAttribute(String attr_name, Clazz clazz);
	
	String generateWriteStack(INFO i);
	
	String generateReadStack(INFO i);
	
	String generateMethodCall(MethodList m_list, String m_name);
	
	String generateMethod(Clazz clazz, String etiquette, String name);
	
	String generateMain();
	
	String generateReturn(int nb_args, int nb_mots_retour);
	
	boolean canCreateMain();
	
	// TODO: mettre des noms de paramètres explicites
	String generateQualification(String toto, String tata);
}

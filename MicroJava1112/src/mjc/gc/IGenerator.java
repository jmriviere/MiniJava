package mjc.gc;

public interface IGenerator {
	
	String generateWriteHeap(INFO i, int attrDep);
	
	String generateReadHeap(INFO i, int attrDep);
	
	String generateLoadObj(INFO i);
	
	String generateVtable(Clazz pointed, Clazz real);
	
	String generateEtiquette();
	
	String generateHeader();
	
	String generateBloc(String att_code);

	String generateConstructor(Clazz construct, String etiquette);

	String generateAffectationBase(String variable, String code, int dep);

	String generateAffectationPointer(String variable, String code, int dep);
	
	String generateRelativeOperation(String att_lcode, String att_code,
			String att_code2);

	String generateAdditionOperation(String att_lcode, String att_code,
			String att_code2);

	String generateUnaryOperation(String att_code, String att_code2);

	String generateBoolean(int b);

	String generateCst(String variable);

	String generateNull();

	String generateInstance(Clazz clazz);
	
	String generateCallConstructor(Clazz clazz, Signature signature);

	String generateIfThenElse(String codeCond, String codeTrue, String codeFalse);

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
	
	String generateMethodCall(String m_etiq);
	
	String generateMethod(Clazz clazz, String etiquette, String name);
	
	String generateMain();
	
	String generateReturn(int nb_args, int nb_mots_retour);
	
	boolean canCreateMain();
	
	String generateSwapArgs(String code);
	
	String generateNew(Clazz clazz, INFO info, String ArgsCode, Signature ConsSig);
	
	// TODO: mettre des noms de paramètres explicites
	String generateQualification(String toto, String tata);
}

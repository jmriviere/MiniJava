package mjc.egg;
import mg.egg.eggc.compiler.libjava.ISourceUnit;
import mg.egg.eggc.compiler.libjava.SourceUnit;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import mg.egg.eggc.compiler.libjava.problem.ProblemReporter;
import mg.egg.eggc.compiler.libjava.problem.ProblemRequestor;
import java.io.*;
public class MJAVAC implements Serializable {
 	private static final long serialVersionUID = 1L;
  public static void main(String[] args){
    System.err.println("version " + "0.0.0");
    try {
      ISourceUnit cu = new SourceUnit(args[0]);
      ProblemReporter prp = new ProblemReporter(cu);
      ProblemRequestor prq = new ProblemRequestor();
      //new EGGOptionsAnalyzer(cu).analyse();
      MJAVA compilo = new MJAVA(prp);
      prq.beginReporting();
      compilo.compile(cu);
      for(IProblem problem : prp.getAllProblems())
      	prq.acceptProblem(problem );
      prq.endReporting();
      System.exit(0);
      }
    catch(Exception e){
      e.printStackTrace();
      System.exit(1);
      }
    }
  }

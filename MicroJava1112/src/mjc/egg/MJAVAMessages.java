package mjc.egg;
import java.util.ResourceBundle;
import mg.egg.eggc.compiler.libjava.messages.NLS;
public class MJAVAMessages extends NLS {
  private static final long serialVersionUID = 1L;
  private static final String BUNDLE_NAME = "mjc.properties.MJAVAMessages";
  private MJAVAMessages() {
  // Do not instantiate
  }
  static {
  NLS.initializeMessages(BUNDLE_NAME, mjc.egg.MJAVAMessages.class);
  }
  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
  public static ResourceBundle getResourceBundle() {
  return RESOURCE_BUNDLE;
  }		

  public static  String MJAVA_expected_token;
  public static  String MJAVA_unexpected_token;
  public static  String MJAVA_expected_eof;
  }

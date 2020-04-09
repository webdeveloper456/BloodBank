Forcing RTL

If you want to force RTL on LRT devices (not recommended, users don’t expect this experience), find the line ‘super.onCreate(savedInstanceState);‘ in MainActivity.java and paste the following code below:

Locale locale = new Locale("ar");
Resources resources = getResources();
Configuration config = resources.getConfiguration();
config.locale = locale;
if (Build.VERSION.SDK_INT >= 17) {
    config.setLayoutDirection(locale);
}
resources.updateConfiguration(config, resources.getDisplayMetrics());
Follow the suggested options to import Locale and Resources on top of the file (below the package name definition):

import java.util.Locale;
import android.content.res.Resources;

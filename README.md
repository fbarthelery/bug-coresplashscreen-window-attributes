Splashscreen window attributes bug
============

Sample project for this [issue](https://issuetracker.google.com/issues/214408199)

Description
----------

In core-splashcreen-1.0.0-rc01, Theme.Splashscreen set android:windowLayoutInDisplayCutoutMode 
param is set to shortEdge. This flag value is kept after changing to the postSplashScreenTheme 
which is a surprising behavior.

A workaround is to set back android:windowLayoutInDisplayCutoutMode to default in the postSplashScreenTheme.

This also affects some other attributes like android:enforceNavigationBarContrast.


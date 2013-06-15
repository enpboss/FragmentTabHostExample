FragmentTabHostExample
======================
This project is an example of using FragmentTabHost in Android.
http://developer.android.com/reference/android/support/v4/app/FragmentTabHost.html

This demo shows how you can use FragmentTabHost to create tabs and use fragment as the content.

It also demos the use of nested fragment to allow each tab to maintain its own fragment backstack, such that when you switch tabs the previous tab history won't lost.

The MainActivity overrides the onBackPressed() method and pops the current tab fragment to allow you to navigate back

Basic Structure:

FragmentTabHost
        |
        Tab1ContainerFragment
        |         |
        |         Tab1Fragment  - Tab1AddOnFragment - ......
        |
        Tab2ContainerFragment
                  |
                  Tab2Fragment  - Tab2AddOnFragment - ......

Complete Android Fragment & Activity Lifecycle
----------------------------------------------

After struggling with trying to figure out how various pieces fit together,
I've done some research and put together the complete Android Activity/Fragment
lifecycle chart. This has two parallel lifecycles (activities and fragments)
which are organized vertically by time. Lifecycle stages will occur in the
vertical order in which they're displayed, across activities and fragments. In
this way, you can see how your fragments interact with your activities.

If you see any discrepancies or errors in this diagram, please submit a pull
request or contact [steve@staticfree.info](mailto:steve@staticfree.info).

![A Complete Android Fragment & Activity Lifecycle](complete_android_fragment_lifecycle.png)

### Some Notes

This intentionally leaves off user-triggered callbacks (such as
`onCreateOptionsMenu()`), focusing on the lifecycle stages that are triggered
by the system, in order to keep the diagram more focused on the parts that are
hard to follow.

This diagram was originally created in [Dia][] and has been rendered to PNG via
[Inkscape][].

[Dia]: http://dia-installer.de/
[Inkscape]: http://inkscape.org/

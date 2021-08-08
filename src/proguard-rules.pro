# Add any ProGuard configurations specific to this
# extension here.

-keep public class xyz.logicaldevz.explosiveview.ExplosiveView {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'xyz/logicaldevz/explosiveview/repack'
-flattenpackagehierarchy
-dontpreverify

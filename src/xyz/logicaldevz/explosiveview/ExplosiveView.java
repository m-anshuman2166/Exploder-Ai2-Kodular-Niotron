package xyz.logicaldevz.explosiveview;

import android.view.View;
import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.YailList;
import com.gejiahui.library.explosionanimation.ExplosionField;
import com.gejiahui.library.explosionanimation.particle.ExplodeParticle;
import com.gejiahui.library.explosionanimation.particle.FlyAwayParticle;
import com.gejiahui.library.explosionanimation.particle.LeftParticle;
import com.gejiahui.library.explosionanimation.particle.RightParticle;
public class ExplosiveView extends AndroidNonvisibleComponent {
private Context context;
    private Activity activity;
private ExplosionField mExplosionField;
  public ExplosiveView(ComponentContainer container) {
    super(container.$form());
this.activity = container.$context();
        this.context = container.$context();
  }

    @SimpleFunction
    public void Explode(AndroidViewComponent viewToExplode){
try {
ExplosionField mExplosionField = ExplosionField.attach2Window(this.activity);
mExplosionField.explode(this.activity, viewToExplode.getView(), new ExplodeParticle());
AnimationDone();
}
catch(Exception e) {
  ErrorOccured();
}
}
 @SimpleFunction
    public void FlyAwayParticle(AndroidViewComponent viewToExplode){
try {
ExplosionField mExplosionField = ExplosionField.attach2Window(this.activity);
mExplosionField.explode(this.activity, viewToExplode.getView(), new FlyAwayParticle());
AnimationDone();
}
catch(Exception e) {
  ErrorOccured();
}

}
 @SimpleFunction
    public void RightParticle(AndroidViewComponent viewToExplode){
try{
ExplosionField mExplosionField = ExplosionField.attach2Window(this.activity);
mExplosionField.explode(this.activity, viewToExplode.getView(), new RightParticle());
AnimationDone();
}
catch(Exception e) {
  ErrorOccured();
}
}
 @SimpleFunction
public void LeftParticle(AndroidViewComponent viewToExplode){
try{
ExplosionField mExplosionField = ExplosionField.attach2Window(this.activity);
mExplosionField.explode(this.activity, viewToExplode.getView(), new LeftParticle());
AnimationDone();
}
catch(Exception e) {
  ErrorOccured();
}

}
@SimpleEvent
    public void ErrorOccured(){
        EventDispatcher.dispatchEvent(this, "Error");
    }
@SimpleEvent
    public void AnimationDone(){
        EventDispatcher.dispatchEvent(this, "Done");
    }
}

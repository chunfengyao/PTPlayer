package com.ycf.ptplayer;

import android.app.Application;
import android.content.Intent;

import com.tencent.tinker.anno.DefaultLifeCycle;
import com.tencent.tinker.loader.app.DefaultApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareConstants;

@DefaultLifeCycle(
		application = ".PtPlayerWithHotFixApplication",
		flags = ShareConstants.TINKER_ENABLE_ALL
)
public class PtPlayerWithHotFix extends DefaultApplicationLike {
	public PtPlayerWithHotFix(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
		super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
	}

}

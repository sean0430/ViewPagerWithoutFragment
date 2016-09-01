/*
 * Copyright (C) 2016 Sean Lin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.nanastudio.sean.viewpagerwithoutfragment.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.nanastudio.sean.viewpagerwithoutfragment.MockData;

/**
 * NoFragmentDemo
 * Created by Sean on 2016/9/1下午2:32.
 */
public class BlueView extends RelativeLayout {
    public BlueView(Context context) {
        super(context);
    }

    public BlueView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BlueView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public BlueView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

       new MockData().setRvFruit(getContext(),this,
               "blueberry","blue");
    }

}

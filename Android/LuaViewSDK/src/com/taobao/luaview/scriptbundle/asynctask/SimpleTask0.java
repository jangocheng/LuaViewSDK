/*
 * Created by LuaView.
 * Copyright (c) 2017, Alibaba Group. All rights reserved.
 *
 * This source code is licensed under the MIT.
 * For the full copyright and license information,please view the LICENSE file in the root directory of this source tree.
 */

package com.taobao.luaview.scriptbundle.asynctask;

/**
 * 简单任务封装
 *
 * @author song
 */
public abstract class SimpleTask0 extends BaseAsyncTask<Object, Object, Object> {

    @Override
    protected Object doInBackground(Object... params) {
        doTask();
        return null;
    }

    public abstract void doTask();
}
package com.br.phdev.gameandroidbase.connection;

/*
 * Copyright (C) 2018 Paulo Henrique Gonçalves Bacelar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public abstract class Connection implements Runnable, OnWriteListener {

    protected boolean connected;

    protected OnReadListener onConnectReadListener;
    protected OnConnectStatusListener onConnectListener;

    public void setOnConnectionStatusListener(OnConnectStatusListener onConnectListener) {
        this.onConnectListener = onConnectListener;
    }

    public void setOnConnectReadListener(OnReadListener onConnectReadListener) {
        this.onConnectReadListener = onConnectReadListener;
    }

    public OnReadListener getOnConnectReadListener() {
        return this.onConnectReadListener;
    }

    public OnWriteListener getOnWriteListener() {
        return this;
    }

    public abstract Runnable connect();

    public abstract void disconnect();

}

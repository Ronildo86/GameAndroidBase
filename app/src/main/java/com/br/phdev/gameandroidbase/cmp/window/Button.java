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
package com.br.phdev.gameandroidbase.cmp.window;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;

import com.br.phdev.gameandroidbase.cmp.graphics.Texture;
import com.br.phdev.gameandroidbase.cmp.listeners.ActionListener;
import com.br.phdev.gameandroidbase.cmp.listeners.ClickListener;
import com.br.phdev.gameandroidbase.cmp.utils.Text;

/**
 * Classe responsavel pela criação de botões para janelas.
 * @version 1.0
 */
public class Button extends WindowEntity {

    /**
     * Cria um botão em uma area.
     * @param x posição no eixo x do botão.
     * @param y posição no eixo y do botão.
     * @param width largura do botão.
     * @param height altura do botão.
     */
    public Button(float x, float y, float width, float height) {
        super(new RectF(x, y, x + width, y + height));
        super.changeClickEffect(DEFAULT_CLICK_EFFECT);
        super.defaultPaint.setColor(Color.YELLOW);
    }

    /**
     * Cria um botão em uma area.
     * @param area area para o botão.
     */
    public Button(RectF area) {
        super(area);
        super.changeClickEffect(DEFAULT_CLICK_EFFECT);
        super.defaultPaint.setColor(Color.YELLOW);
    }

    /**
     * Cria um botão em uma area.
     * @param x posição no eixo x do botão.
     * @param y posição no eixo y do botão.
     * @param width largura do botão.
     * @param height altura do botão.
     * @param buttonText texto a ser exibido no botão.
     */
    public Button(float x, float y, float width, float height, String buttonText) {
        super(new RectF(x, y, x + width, y + height), new Text(buttonText));
        super.changeClickEffect(DEFAULT_CLICK_EFFECT);
        super.defaultPaint.setColor(Color.YELLOW);
    }

    /**
     * Cria um botão contendo texto em uma area.
     * @param area area para o botão.
     * @param buttonText texto a ser exibido no botão.
     */
    public Button(RectF area, String buttonText) {
        super(area, new Text(buttonText));
        super.changeClickEffect(DEFAULT_CLICK_EFFECT);
        super.defaultPaint.setColor(Color.YELLOW);
    }

    public Button(RectF area, String buttonText, Texture texture) {
        super(area, new Text(buttonText), texture);
        super.changeClickEffect(DEFAULT_CLICK_EFFECT);
        super.defaultPaint.setColor(Color.YELLOW);
    }

    /**
     * Cria um botão contendo um texto em uma area.
     * @param area area para o botão.
     * @param buttonText {@link Text} para o botão.
     */
    public Button(RectF area, Text buttonText) {
        super(area, buttonText);
        super.changeClickEffect(DEFAULT_CLICK_EFFECT);
        super.defaultPaint.setColor(Color.YELLOW);
    }

    /**
     * Cria um botão contendo um texto.
     * Usado para colocar a entidade em um layout, e deixar ela definir a area para o botão.
     * @param textButton texto a ser exibido no botão.
     */
    public Button(String textButton) {
        super(new RectF(), new Text(textButton));
        super.changeClickEffect(DEFAULT_CLICK_EFFECT);
        super.defaultPaint.setColor(Color.YELLOW);
    }

    @Override
    public void setFireActionType(int fireActionType) {
        this.fireActionType = fireActionType;
    }

    /**
     * Redefine o texto a ser exibido no botão.
     * @param text texto a ser exibido.
     */
    public void setText(String text) {
        super.entityText.setText(text);
    }

    /**
     * Retorna a {@link String} do texto do botão.
     * @return {@link String} do texto.
     */
    public String getText() {
        return super.entityText.toString();
    }

    /**
     * Redefine o tamanho da fonte do texto a ser exibido no botão.
     * @param size tamanho da fonte.
     */
    public void setTextSize(float size) {
        super.entityText.setSize(size);
        //super.entityText.setTextSizeAdjusted(false);
    }

    /**
     * Redefine a cor do botão.
     * @param color cor para o botao.
     */
    @Deprecated
    public void setColor(int color) {
        super.defaultPaint.setColor(color);
    }

    /**
     * Retorna a cor atual do botão.
     * @return cor do botão.
     */
    @Deprecated
    public int getColor() {
        return super.defaultPaint.getColor();
    }

    /**
     * Redefine a escuta para eventos de ação para o botão.
     * @param listener nova escuta pra o botão.
     */
    public void addActionListener(ActionListener listener) {
        super.addListener(listener);
    }

    /**
     * Redefine a escuta de eventos de clique para o botão.
     * @param listener nova escuta para o botão.
     */
    public void addClickListener(ClickListener listener) {
        super.addListener(listener);
    }
}

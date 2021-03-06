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

import com.br.phdev.gameandroidbase.cmp.listeners.ActionListener;
import com.br.phdev.gameandroidbase.cmp.listeners.ClickListener;
import com.br.phdev.gameandroidbase.cmp.utils.Text;

/**
 * Classe responsavel pela criação de labels para janelas.
 * (Entidades que exibem algo, ou não, e não interagiveis por padrão).
 */
public class Label extends WindowEntity {

    public Label() {
        super();
        super.defaultPaint.setColor(Color.WHITE);
        super.edgeVisible = false;
    }

    /**
     * Cria um label em uma area.
     * @param x posição no eixo x do label.
     * @param y posição no eixo y do label.
     * @param width largura do label.
     * @param height altura do label.
     */
    public Label(float x, float y, float width, float height) {
        super(new RectF(x, y, x + width, y + height));
        super.defaultPaint.setColor(Color.WHITE);
        super.edgeVisible = false;
    }

    /**
     * Cria um label em uma area.
     * @param area area para o label.
     */
    public Label(RectF area) {
        super(area);
        super.defaultPaint.setColor(Color.WHITE);
        super.edgeVisible = false;
    }

    /**
     * Cria um label contendo um texto em uma area.
     * @param area area para o label
     * @param labelText texto para o label.
     */
    public Label(RectF area, String labelText) {
        super(area, new Text(labelText));
        super.defaultPaint.setColor(Color.WHITE);
        super.edgeVisible = false;
    }

    /**
     * Cria um label contendo um texto em uma area.
     * @param area area para o label.
     * @param text texto para o label.
     */
    public Label(RectF area, Text text) {
        super(area, text);
        super.defaultPaint.setColor(Color.WHITE);
        super.edgeVisible = false;
    }

    /**
     * Cria um label contendo um texto.
     * * Usado para colocar a entidade em um layout, e deixar ela definir a area para o label.
     * @param text
     */
    public Label(String text) {
        super(new RectF(), new Text(text));
        super.defaultPaint.setColor(Color.WHITE);
        super.edgeVisible = false;
    }

    /**
     * Cria um label contendo um texto.
     * * Usado para colocar a entidade em um layout, e deixar ela definir a area para o label.
     * @param text
     */
    public Label(Text text) {
        super(new RectF(), text);
        super.defaultPaint.setColor(Color.WHITE);
        super.edgeVisible = false;
    }

    public void setText(String text) {
        super.entityText.setText(text);
    }

    public String getText() {
        return super.entityText.toString();
    }

    public void setTextSize(float size) {
        super.entityText.setSize(size);
    }

    /**
     * Redefine a escuta para eventos de ação para o label.
     * @param actionListener nova escuta pra o label.
     */
    public void addActionListener(ActionListener actionListener) {
        super.addListener(actionListener);
    }

    /**
     * Redefine a escuta de eventos de clique para o label.
     * @param clickListener nova escuta para o label.
     */
    public void addClickListener(ClickListener clickListener) {
        super.addListener(clickListener);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jupyterkernel.json.messages;

import org.jupyterkernel.util.JSONField;

/**
 *
 * @author kay schluehr
 */
public class T_inspect_request extends T_JSON {
    @JSONField
    public String code;

    @JSONField
    public Integer cursor_pos;    
    
    @JSONField
    public Integer detail_level;    
    
}

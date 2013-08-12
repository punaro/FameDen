/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ravs.util;

import com.ravs.animations.ShakeAnimation;
import com.ravs.animations.WobbleAnimation;
import javafx.scene.Node;

/**
 *
 * @author Ravjot
 */
public class InvokeAnimation {

    public static void attentionSeekerShake(Node node) {
        ShakeAnimation shakeTransition;
        shakeTransition = new ShakeAnimation(node);
        //node.getStyleClass().add("error");
        shakeTransition.play();
    }

    public static void attentionSeekerWobble(Node node) {
        WobbleAnimation wobbleTransition;
        wobbleTransition = new WobbleAnimation(node);
        //node.getStyleClass().add("error");
        wobbleTransition.play();
    }
}

package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

@Suppress("unused")
open class EM(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("em", consumer, initialAttributes, null, true, false), HtmlInlineTag {

}

@Suppress("unused")
open class EMBED(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("embed", consumer, initialAttributes, null, true, true), CommonAttributeGroupFacade {
    var src : String
        get()  = attributeStringString.get(this, "src")
        set(newValue) {attributeStringString.set(this, "src", newValue)}

    var height : String
        get()  = attributeStringString.get(this, "height")
        set(newValue) {attributeStringString.set(this, "height", newValue)}

    var width : String
        get()  = attributeStringString.get(this, "width")
        set(newValue) {attributeStringString.set(this, "width", newValue)}

    var type : String
        get()  = attributeStringString.get(this, "type")
        set(newValue) {attributeStringString.set(this, "type", newValue)}


}


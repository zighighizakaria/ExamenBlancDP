package org.example;

import java.util.*;

public class Class extends Entity {
    private Attribut attribut;
    private Method methode;
    private boolean estPublique;
    private boolean estAbstraite;
    private boolean estStatique;
    private boolean estFinale;
    public java.util.Collection<Method> method;
    public Constructor constructor;

    public void ajouterAttribut() {
        // TODO: implement
    }

    public void ajouterMethode() {
        // TODO: implement
    }

    public java.util.Collection<Attribut> getAttribut() {
        if (attribut == null)
            attribut = new java.util.HashSet<Attribut>();
        return attribut;
    }

    public java.util.Iterator getIteratorAttribut() {
        if (attribut == null)
            attribut = new java.util.HashSet<Attribut>();
        return attribut.iterator();
    }

    public void setAttribut(java.util.Collection<Attribut> newAttribut) {
        removeAllAttribut();
        for (java.util.Iterator iter = newAttribut.iterator(); iter.hasNext();)
            addAttribut((Attribut)iter.next());
    }

    public void addAttribut(Attribut newAttribut) {
        if (newAttribut == null)
            return;
        if (this.attribut == null)
            this.attribut = new java.util.HashSet<Attribut>();
        if (!this.attribut.contains(newAttribut))
        {
            this.attribut.add(newAttribut);
            newAttribut.setClass(this);
        }
    }

    public void removeAttribut(Attribut oldAttribut) {
        if (oldAttribut == null)
            return;
        if (this.attribut != null)
            if (this.attribut.contains(oldAttribut))
            {
                this.attribut.remove(oldAttribut);
                oldAttribut.setClass((Class)null);
            }
    }

    public void removeAllAttribut() {
        if (attribut != null)
        {
            Attribut oldAttribut;
            for (java.util.Iterator iter = getIteratorAttribut(); iter.hasNext();)
            {
                oldAttribut = (Attribut)iter.next();
                iter.remove();
                oldAttribut.setClass((Class)null);
            }
        }
    }

    public java.util.Collection<Method> getMethod() {
        if (method == null)
            method = new java.util.HashSet<Method>();
        return method;
    }

    public java.util.Iterator getIteratorMethod() {
        if (method == null)
            method = new java.util.HashSet<Method>();
        return method.iterator();
    }

    public void setMethod(java.util.Collection<Method> newMethod) {
        removeAllMethod();
        for (java.util.Iterator iter = newMethod.iterator(); iter.hasNext();)
            addMethod((Method)iter.next());
    }

    public void addMethod(Method newMethod) {
        if (newMethod == null)
            return;
        if (this.method == null)
            this.method = new java.util.HashSet<Method>();
        if (!this.method.contains(newMethod))
        {
            this.method.add(newMethod);
            newMethod.setClass(this);
        }
    }

    public void removeMethod(Method oldMethod) {
        if (oldMethod == null)
            return;
        if (this.method != null)
            if (this.method.contains(oldMethod))
            {
                this.method.remove(oldMethod);
                oldMethod.setClass((Class)null);
            }
    }

    public void removeAllMethod() {
        if (method != null)
        {
            Method oldMethod;
            for (java.util.Iterator iter = getIteratorMethod(); iter.hasNext();)
            {
                oldMethod = (Method)iter.next();
                iter.remove();
                oldMethod.setClass((Class)null);
            }
        }
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor newConstructor) {
        if (this.constructor == null || !this.constructor.equals(newConstructor))
        {
            if (this.constructor != null)
            {
                Constructor oldConstructor = this.constructor;
                this.constructor = null;
                oldConstructor.removeClass(this);
            }
            if (newConstructor != null)
            {
                this.constructor = newConstructor;
                this.constructor.addClass(this);
            }
        }
    }
}

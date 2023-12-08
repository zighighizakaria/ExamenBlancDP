package org.example;

import java.util.*;

public class DiagrammeDeClasse {
    private Entity entitie;
    private Relation relation;
    private Observer observer;

    public Collection<Entity> entity;
    public Collection<Groupe> groupe;
    public IStrategyExporter iStrategyExporter;

    public String genererCode() {
        return null;
    }

    public String exporterFormat() {
        return null;
    }

    public void ajouterEntite() {
        // TODO: implement
    }

    public void ajouterRelation() {
        // TODO: implement
    }

    public void ajouterGroupe() {
        // TODO: implement
    }

    public void ajouterObservateur() {
        // TODO: implement
    }

    public Collection<Entity> getEntity() {
        if (entity == null)
            entity = new HashSet<Entity>();
        return entity;
    }

    public Iterator getIteratorEntity() {
        if (entity == null)
            entity = new HashSet<Entity>();
        return entity.iterator();
    }

    public void setEntity(Collection<Entity> newEntity) {
        removeAllEntity();
        for (Iterator iter = newEntity.iterator(); iter.hasNext();)
            addEntity((Entity)iter.next());
    }

    public void addEntity(Entity newEntity) {
        if (newEntity == null)
            return;
        if (this.entity == null)
            this.entity = new HashSet<Entity>();
        if (!this.entity.contains(newEntity))
        {
            this.entity.add(newEntity);
            newEntity.setDiagrammeDeClasse(this);
        }
    }

    public void removeEntity(Entity oldEntity) {
        if (oldEntity == null)
            return;
        if (this.entity != null)
            if (this.entity.contains(oldEntity))
            {
                this.entity.remove(oldEntity);
                oldEntity.setDiagrammeDeClasse((DiagrammeDeClasse)null);
            }
    }

    public void removeAllEntity() {
        if (entity != null)
        {
            Entity oldEntity;
            for (Iterator iter = getIteratorEntity(); iter.hasNext();)
            {
                oldEntity = (Entity)iter.next();
                iter.remove();
                oldEntity.setDiagrammeDeClasse((DiagrammeDeClasse)null);
            }
        }
    }

    public Collection<Relation> getRelation() {
        if (relation == null)
            relation = new HashSet<Relation>();
        return relation;
    }

    public Iterator getIteratorRelation() {
        if (relation == null)
            relation = new HashSet<Relation>();
        return relation.iterator();
    }

    public void setRelation(Collection<Relation> newRelation) {
        removeAllRelation();
        for (Iterator iter = newRelation.iterator(); iter.hasNext();)
            addRelation((Relation)iter.next());
    }

    public void addRelation(Relation newRelation) {
        if (newRelation == null)
            return;
        if (this.relation == null)
            this.relation = new HashSet<Relation>();
        if (!this.relation.contains(newRelation))
        {
            this.relation.add(newRelation);
            newRelation.setDiagrammeDeClasse(this);
        }
    }

    public void removeRelation(Relation oldRelation) {
        if (oldRelation == null)
            return;
        if (this.relation != null)
            if (this.relation.contains(oldRelation))
            {
                this.relation.remove(oldRelation);
                oldRelation.setDiagrammeDeClasse((DiagrammeDeClasse)null);
            }
    }

    public void removeAllRelation() {
        if (relation != null)
        {
            Relation oldRelation;
            for (Iterator iter = getIteratorRelation(); iter.hasNext();)
            {
                oldRelation = (Relation)iter.next();
                iter.remove();
                oldRelation.setDiagrammeDeClasse((DiagrammeDeClasse)null);
            }
        }
    }

    public Collection<Groupe> getGroupe() {
        if (groupe == null)
            groupe = new HashSet<Groupe>();
        return groupe;
    }

    public Iterator getIteratorGroupe() {
        if (groupe == null)
            groupe = new HashSet<Groupe>();
        return groupe.iterator();
    }

    public void setGroupe(Collection<Groupe> newGroupe) {
        removeAllGroupe();
        for (Iterator iter = newGroupe.iterator(); iter.hasNext();)
            addGroupe((Groupe)iter.next());
    }

    public void addGroupe(Groupe newGroupe) {
        if (newGroupe == null)
            return;
        if (this.groupe == null)
            this.groupe = new HashSet<Groupe>();
        if (!this.groupe.contains(newGroupe))
        {
            this.groupe.add(newGroupe);
            newGroupe.setDiagrammeDeClasse(this);
        }
    }

    public void removeGroupe(Groupe oldGroupe) {
        if (oldGroupe == null)
            return;
        if (this.groupe != null)
            if (this.groupe.contains(oldGroupe))
            {
                this.groupe.remove(oldGroupe);
                oldGroupe.setDiagrammeDeClasse((DiagrammeDeClasse)null);
            }
    }

    public void removeAllGroupe() {
        if (groupe != null)
        {
            Groupe oldGroupe;
            for (Iterator iter = getIteratorGroupe(); iter.hasNext();)
            {
                oldGroupe = (Groupe)iter.next();
                iter.remove();
                oldGroupe.setDiagrammeDeClasse((DiagrammeDeClasse)null);
            }
        }
    }

    public Collection<Observer> getObserver() {
        if (observer == null)
            observer = new HashSet<Observer>();
        return observer;
    }

    public Iterator getIteratorObserver() {
        if (observer == null)
            observer = new HashSet<Observer>();
        return observer.iterator();
    }

    public void setObserver(Collection<Observer> newObserver) {
        removeAllObserver();
        for (Iterator iter = newObserver.iterator(); iter.hasNext();)
            addObserver((Observer)iter.next());
    }

    public void addObserver(Observer newObserver) {
        if (newObserver == null)
            return;
        if (this.observer == null)
            this.observer = new HashSet<Observer>();
        if (!this.observer.contains(newObserver))
        {
            this.observer.add(newObserver);
            newObserver.setDiagrammeDeClasse(this);
        }
    }

    public void removeObserver(Observer oldObserver) {
        if (oldObserver == null)
            return;
        if (this.observer != null)
            if (this.observer.contains(oldObserver))


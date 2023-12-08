package org.example;

import java.util.*;

public abstract class Entity {
    private String nom;
    public DiagrammeDeClasse diagrammeDeClasse;

    public DiagrammeDeClasse getDiagrammeDeClasse() {
        return diagrammeDeClasse;
    }

    public void setDiagrammeDeClasse(DiagrammeDeClasse newDiagrammeDeClasse) {
        if (this.diagrammeDeClasse == null || !this.diagrammeDeClasse.equals(newDiagrammeDeClasse))
        {
            if (this.diagrammeDeClasse != null)
            {
                DiagrammeDeClasse oldDiagrammeDeClasse = this.diagrammeDeClasse;
                this.diagrammeDeClasse = null;
                oldDiagrammeDeClasse.removeEntity(this);
            }
            if (newDiagrammeDeClasse != null)
            {
                this.diagrammeDeClasse = newDiagrammeDeClasse;
                this.diagrammeDeClasse.addEntity(this);
            }
        }
    }
}

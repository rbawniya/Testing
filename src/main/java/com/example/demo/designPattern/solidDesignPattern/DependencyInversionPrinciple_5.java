package com.example.demo.designPattern.solidDesignPattern;

//The Dependency Inversion Principle (DIP) is a principle in object-oriented design that states that "High-level modules should not depend on low-level modules. Both should depend on abstractions". Additionally, abstractions should not depend on details. Details should depend on abstractions.

//In a software development team, developers depend on an abstract version control system (e.g., Git) to manage and track changes to the codebase. They don't depend on specific details of how Git works internally.


public class DependencyInversionPrinciple_5 {
    public static void main(String[] args) {
        VersionTool versionTool = new GitHubTool();
        DeveloperTeam developerTeam = new DeveloperTeam(versionTool);
        developerTeam.commit();
        developerTeam.push();
        developerTeam.pull();
    }
}

interface VersionTool {
    void commit();
    void push();
    void pull();
}

class GitHubTool implements VersionTool {

    @Override
    public void commit() {
        System.out.println("Commit!!");
    }

    @Override
    public void push() {
        System.out.println("Push!!");
    }

    @Override
    public void pull() {
        System.out.println("Pull!!");
    }
}

class DeveloperTeam {
    private VersionTool versionTool;
    DeveloperTeam(VersionTool versionTool) {
        this.versionTool = versionTool;
    }

    public void commit() {
        this.versionTool.commit();
    }

    public void push() {
        this.versionTool.push();
    }

    public void pull() {
        this.versionTool.pull();
    }
}

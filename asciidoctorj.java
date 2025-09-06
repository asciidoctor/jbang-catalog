///usr/bin/env jbang "$0" "$@" ; exit $?

// The same list of JARs that appear in the asciidoctorj shell script

// https://mvnrepository.com/artifact/org.asciidoctor/asciidoctorj
//DEPS org.asciidoctor:asciidoctorj:3.0.0

// https://mvnrepository.com/artifact/org.asciidoctor/asciidoctorj-api
//DEPS org.asciidoctor:asciidoctorj-api:3.0.0

// https://mvnrepository.com/artifact/org.asciidoctor/asciidoctorj-cli
//DEPS org.asciidoctor:asciidoctorj-cli:3.0.0

// https://mvnrepository.com/artifact/org.asciidoctor/asciidoctorj-epub3
//DEPS org.asciidoctor:asciidoctorj-epub3:2.2.0

// https://mvnrepository.com/artifact/org.asciidoctor/asciidoctorj-diagram
//DEPS org.asciidoctor:asciidoctorj-diagram:3.0.1

// https://mvnrepository.com/artifact/org.asciidoctor/asciidoctorj-diagram-batik
//DEPS org.asciidoctor:asciidoctorj-diagram-batik:1.17

// https://mvnrepository.com/artifact/org.asciidoctor/asciidoctorj-diagram-ditaamini
//DEPS org.asciidoctor:asciidoctorj-diagram-ditaamini:1.0.3

// https://mvnrepository.com/artifact/org.asciidoctor/asciidoctorj-diagram-plantuml
//DEPS org.asciidoctor:asciidoctorj-diagram-plantuml:1.2025.3

// https://mvnrepository.com/artifact/org.asciidoctor/asciidoctorj-diagram-jsyntrax
//DEPS org.asciidoctor:asciidoctorj-diagram-jsyntrax:1.38.2

// https://mvnrepository.com/artifact/org.asciidoctor/asciidoctorj-pdf
//DEPS org.asciidoctor:asciidoctorj-pdf:2.3.19

// https://mvnrepository.com/artifact/org.asciidoctor/asciidoctorj-revealjs
//DEPS org.asciidoctor:asciidoctorj-revealjs:5.2.0

// https://mvnrepository.com/artifact/org.jcommander/jcommander
//DEPS org.jcommander:jcommander:2.0

// https://mvnrepository.com/artifact/org.jruby/jruby-complete
//DEPS org.jruby:jruby-complete:9.4.8.0

import java.io.IOException;

public class asciidoctorj {
    public static void main(String[] args) throws IOException {
        org.asciidoctor.cli.jruby.AsciidoctorInvoker.main(args);
    }
}

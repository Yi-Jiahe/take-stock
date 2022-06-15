FROM gitpod/workspace-postgres

RUN brew install clojure/tools/clojure
RUN brew install leiningen
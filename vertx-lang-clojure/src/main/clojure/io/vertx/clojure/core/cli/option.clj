(ns io.vertx.clojure.core.cli.option)

(import io.vertx.core.cli.Option)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  
  ([^JsonObject json] (new Option json)))

(defn set-arg-name [^Option option arg-name] (.setArgName option arg-name))
(defn get-arg-name [^Option option] (.getArgName option))
(defn add-choice [^Option option choices] (.addChoice option choices))
(defn set-choices [^Option option choices] (.setChoices option choices))
(defn get-choices [^Option option] (.getChoices option))
(defn set-default-value [^Option option default-value] (.setDefaultValue option default-value))
(defn get-default-value [^Option option] (.getDefaultValue option))
(defn set-description [^Option option description] (.setDescription option description))
(defn get-description [^Option option] (.getDescription option))
(defn set-flag [^Option option flag] (.setFlag option flag))
(defn is-flag [^Option option] (.isFlag option))
(defn set-help [^Option option help] (.setHelp option help))
(defn is-help [^Option option] (.isHelp option))
(defn set-hidden [^Option option hidden] (.setHidden option hidden))
(defn is-hidden [^Option option] (.isHidden option))
(defn set-long-name [^Option option long-name] (.setLongName option long-name))
(defn get-long-name [^Option option] (.getLongName option))
(defn set-multi-valued [^Option option multi-valued] (.setMultiValued option multi-valued))
(defn is-multi-valued [^Option option] (.isMultiValued option))
(defn get-name [^Option option] (.getName option))
(defn set-required [^Option option required] (.setRequired option required))
(defn is-required [^Option option] (.isRequired option))
(defn set-short-name [^Option option short-name] (.setShortName option short-name))
(defn get-short-name [^Option option] (.getShortName option))
(defn set-single-valued [^Option option single-valued] (.setSingleValued option single-valued))
(defn is-single-valued [^Option option] (.isSingleValued option))
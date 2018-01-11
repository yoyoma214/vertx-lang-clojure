(ns io.vertx.clojure.core.dns.address-resolver-options)

(import io.vertx.core.dns.AddressResolverOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new AddressResolverOptions))
  ([^JsonObject json] (new AddressResolverOptions json)))

(defn set-cache-max-time-to-live [^AddressResolverOptions address-resolver-options cache-max-time-to-live] (.setCacheMaxTimeToLive address-resolver-options cache-max-time-to-live))
(defn get-cache-max-time-to-live [^AddressResolverOptions address-resolver-options] (.getCacheMaxTimeToLive address-resolver-options))
(defn set-cache-min-time-to-live [^AddressResolverOptions address-resolver-options cache-min-time-to-live] (.setCacheMinTimeToLive address-resolver-options cache-min-time-to-live))
(defn get-cache-min-time-to-live [^AddressResolverOptions address-resolver-options] (.getCacheMinTimeToLive address-resolver-options))
(defn set-cache-negative-time-to-live [^AddressResolverOptions address-resolver-options cache-negative-time-to-live] (.setCacheNegativeTimeToLive address-resolver-options cache-negative-time-to-live))
(defn get-cache-negative-time-to-live [^AddressResolverOptions address-resolver-options] (.getCacheNegativeTimeToLive address-resolver-options))
(defn set-hosts-path [^AddressResolverOptions address-resolver-options hosts-path] (.setHostsPath address-resolver-options hosts-path))
(defn get-hosts-path [^AddressResolverOptions address-resolver-options] (.getHostsPath address-resolver-options))
(defn set-hosts-value [^AddressResolverOptions address-resolver-options hosts-value] (.setHostsValue address-resolver-options hosts-value))
(defn get-hosts-value [^AddressResolverOptions address-resolver-options] (.getHostsValue address-resolver-options))
(defn set-max-queries [^AddressResolverOptions address-resolver-options max-queries] (.setMaxQueries address-resolver-options max-queries))
(defn get-max-queries [^AddressResolverOptions address-resolver-options] (.getMaxQueries address-resolver-options))
(defn set-ndots [^AddressResolverOptions address-resolver-options ndots] (.setNdots address-resolver-options ndots))
(defn get-ndots [^AddressResolverOptions address-resolver-options] (.getNdots address-resolver-options))
(defn set-opt-resource-enabled [^AddressResolverOptions address-resolver-options opt-resource-enabled] (.setOptResourceEnabled address-resolver-options opt-resource-enabled))
(defn is-opt-resource-enabled [^AddressResolverOptions address-resolver-options] (.isOptResourceEnabled address-resolver-options))
(defn set-query-timeout [^AddressResolverOptions address-resolver-options query-timeout] (.setQueryTimeout address-resolver-options query-timeout))
(defn get-query-timeout [^AddressResolverOptions address-resolver-options] (.getQueryTimeout address-resolver-options))
(defn set-rd-flag [^AddressResolverOptions address-resolver-options rd-flag] (.setRdFlag address-resolver-options rd-flag))
(defn get-rd-flag [^AddressResolverOptions address-resolver-options] (.getRdFlag address-resolver-options))
(defn set-rotate-servers [^AddressResolverOptions address-resolver-options rotate-servers] (.setRotateServers address-resolver-options rotate-servers))
(defn is-rotate-servers [^AddressResolverOptions address-resolver-options] (.isRotateServers address-resolver-options))
(defn add-search-domain [^AddressResolverOptions address-resolver-options search-domains] (.addSearchDomain address-resolver-options search-domains))
(defn set-search-domains [^AddressResolverOptions address-resolver-options search-domains] (.setSearchDomains address-resolver-options search-domains))
(defn get-search-domains [^AddressResolverOptions address-resolver-options] (.getSearchDomains address-resolver-options))
(defn add-server [^AddressResolverOptions address-resolver-options servers] (.addServer address-resolver-options servers))
(defn set-servers [^AddressResolverOptions address-resolver-options servers] (.setServers address-resolver-options servers))
(defn get-servers [^AddressResolverOptions address-resolver-options] (.getServers address-resolver-options))
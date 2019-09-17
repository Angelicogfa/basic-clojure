(ns estudo_clojure.agents
  (:gen-class))

;; Definição de um agente
(def counter (agent 0))
(println counter)
(println @counter)

;; Altera o valor de um agente
(send counter + 100)
(println @counter)

;; Interrompe o agente
(shutdown-agents)

;; Atualiza o agente quando o processo que ele estiver aguardando estiver finalizado
(send-off counter + 100)
(println @counter)

;; Função par aguardar o agente atualizar
(await-for 100 counter)

;; Bloqueia a thread para o agente poder ser atualizado
(await counter)

; Obtem os erros durante o processo de sincronismo do agente
(def my-date (agent (java.util.Date.)))
(send my-date + 100)
(await-for 100 my-date)
(agent-error my-date)

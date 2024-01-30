LLD of Logging system based on chain of responsibility pattern.

Advance Logging System Design

Requirements-
1. Should be able to log at multiple places - console, file.
2. Should be able to log mutiple category of messages - Info, error, debug.

Components
Application -> Logger class -> Category(Info, error, debug) 
                            -> Sink (console, file)

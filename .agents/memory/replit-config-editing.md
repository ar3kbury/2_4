---
name: Replit config editing
description: Replit validates edits to core project configuration files through dedicated replacement flows.
---

Do not edit `.replit` or `replit.nix` directly. Write the complete updated TOML to a temporary file within the workspace and use the Replit-provided validated replacement callback.

**Why:** Direct file edits to these configuration files are rejected by the workspace.

**How to apply:** Use this flow when manually changing Replit configuration. Prefer the relevant package or workflow tools when they can make the required change themselves.

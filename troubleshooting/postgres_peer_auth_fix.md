# Resolving PostgreSQL Peer Authentication Error

If you encounter the following error when trying to connect to PostgreSQL:

```bash
psql -U postgres
psql: error: connection to server on socket "/var/run/postgresql/.s.PGSQL.5432" failed: FATAL:  Peer authentication failed for user "postgres"
```

Follow these steps to resolve the issue:

## Option 1: Switch to the "postgres" User

1. Switch to the "postgres" user using the `su` command:

```bash
sudo su - postgres
psql
```

This will change your user to "postgres" and open the PostgreSQL prompt.

## Option 2: Update pg_hba.conf

1. Open pg_hba.conf for editing:

   `sudo nano /etc/postgresql/14/main/pg_hba.conf`

2. Find the line:

   `local all postgres peer`

3. Change "peer" to "md5" to use password authentication:

   `local all postgres md5`

   Save the file and exit.

4. Reload the PostgreSQL configuration:

   `sudo service postgresql restart`

Now you should be able to log in using the "postgres" user with a password:

`psql -U postgres`

- Enter the password when prompted.
- Choose the option that best fits your requirements and security considerations.
